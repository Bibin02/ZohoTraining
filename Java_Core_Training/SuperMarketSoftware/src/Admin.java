import java.util.*;
public class Admin extends Biller{
	private String id;
	private Admin(){}
	private static Admin admninstance;
	
	static Admin login(String id, int pin){
		if (id.equals("admin") && pin == 123){
			if (admninstance == null){
				admninstance = new Admin();
				return admninstance;
			}
			return admninstance;
		}
		return null;
	}
	
	void adminOperations(Scanner scan){

		boolean kill = false;
		do{
			displayDashUser(this.id);
			String option = scan.nextLine();
			switch(option){
				case "1" -> {
					// Create Biller
					boolean status = createBiller(this);
					System.out.println("\nBiller creation Status :"+status);
					
				}
				case "2" -> {
					// Delete Biller
					boolean status = deleteBiller(this, scan);
					System.out.println("\nBiller Deletion Status :"+status);
					
				}
				case "3" -> {
					// Update Groceries
					if (updateGroceries(this, scan)){
						System.out.println("\nGroceries list Updated");
					}
					else
						System.out.println("Fatal error");
					
				}
				case "4" -> {
					// Update profile (Admin)
					boolean status = updateProfile(scan);
					System.out.println("\nProfile Updated :"+status);
					
				}
				case "5" -> {
					// Create customer record
					boolean status = createCustomer(this, scan);
					System.out.println("Record creation Status :"+status);
				}
				
				case "6" -> {System.out.println("\nThank You !!"); kill = true;}
				default -> {System.out.println("Please provide valid respose.");}
			}
		}while(!kill);
	}

	private boolean deleteBiller(Admin admn, Scanner scan){
		System.out.println("Enter the ID and Pin:");
		String id = scan.nextLine();
		int pin = scan.nextInt();
		return DataHandlerDAO.deleteBillerFromDB(admn, id, pin);
	}
	
	private boolean updateGroceries(Admin admn, Scanner scan){
		return DataHandlerDAO.updateGroceriesInDB(admn, scan);
	}

	@Override
	void displayDashUser(String id){
		System.out.println("\n\tWelcome Admin "+id);
		System.out.println("1. Create Biller");
		System.out.println("2. Delete Biller");
		System.out.println("3. Update Groceries");
		System.out.println("4. Update Profile");
		System.out.println("5. Create customer record");
		System.out.println("6. Logout");
	}

	private boolean updateProfile(Scanner scan) {
		System.out.println("Enter your name : ");
		this.id = scan.nextLine();
		return true;
	}
}