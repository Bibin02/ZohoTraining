import java.util.*;
public class Biller{
	protected Biller(){}
	private String id;
	private int pin;
	public int hash;
	private static int count = 0;
	
	// Admin can create Billers
	protected boolean createBiller(Admin admn){
		if (admn != null){
			Biller biller = new Biller();
			count++;
			biller.id = "Biller_" + count;
			biller.pin = count;
			biller.hash = (biller.id+biller.pin).hashCode();
			System.out.println("Biller name :"+biller.id);
			System.out.println("Biller pin :"+biller.pin);
			System.out.println("Biller hash :"+biller.hash);
			return DataHandlerDAO.addBillerInDB(admn, biller);
		}
		return false;
	}
	
	// Data Accessible by Admins
	protected String name;
	
	static Biller login(String Inputid, int Inputpin){
		// Access Biller from DAO class
		return DataHandlerDAO.fetchBiller(Inputid, Inputpin);
	}
	
	void billerOperations(Scanner scan){
		
		boolean kill = false;
		do{
			displayDashUser(this.id);
			String option = scan.nextLine();
			switch(option){
				case "1" -> {
					// Create customer record
					boolean status = createCustomer(this, scan);
					System.out.println("Record creation Status :"+status);
				}
				case "2" -> {
					// Update Profile
					boolean status = updateProfile(scan);
					System.out.println("Update Profile Status :"+status);
				}
				case "3" -> {System.out.println("\nLogout Sucessful. Thank You !!"); kill = true;}
				default -> {System.out.println("Please provide valid respose.");}
			}
		}while(!kill);
	}
	
	boolean createCustomer(Biller biller, Scanner scan){
		return DataHandlerDAO.createCustomerRecord(biller, scan);
	}
	
	void displayDashUser(String id){
		System.out.println("\n\tWelcome "+id);
		System.out.println("1. Create customer record");
		System.out.println("2. Update profile");
		System.out.println("3. Logout");
	}
	
	private boolean updateProfile(Scanner scan) {
		System.out.println("Enter your name : ");
		this.id = scan.nextLine();
		return true;
	}
}