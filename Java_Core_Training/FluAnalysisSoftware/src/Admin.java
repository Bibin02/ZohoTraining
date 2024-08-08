import java.util.Scanner;
import java.io.IOException;

class Admin{
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
					// Update DataBase
					try {
						if (updateData(this, scan)){
							System.out.println("\nData Updated in Database.");
						}
						else
							System.out.println("Fatal error");
					}
					catch (IOException io){
						
					}
					
				}
				case "2" -> {
					// Update profile (Admin)
					boolean status = updateProfile(scan);
					System.out.println("\nProfile Updated :"+status);
				}
				
				case "3" -> {System.out.println("\nThank You !!"); kill = true;}
				default -> {System.out.println("Please provide valid respose.");}
			}
		}while(!kill);
	}
	
	private boolean updateData(Admin admn, Scanner scan) throws IOException{
		System.out.println("\n\tUpdate Data Portal "+id);
		System.out.println("-> Update Data in (TOTAL, CITY, HOSP, MED, DOC): ");
		String option = scan.nextLine();
		DAO dao = new DAO();
		
		switch(option){
				case "CITY" -> {
					// Update CITY DataBase
					if (dao.updateCityData(this, scan)){
						System.out.println("\n"+option+" Data Updated in Database.");
						return true;
					}
					else
						System.out.println("Fatal error");

					
				}
				case "HOSP" -> {
					// Update HOSPITAL DataBase
					if (dao.updateHospData(this, scan)){
						System.out.println("\n"+option+" Data Updated in Database.");
						return true;
					}
					else
						System.out.println("Fatal error");
				}
					
				case "MED" -> {
					// Update MEDICINE DataBase
					if (dao.updateMedData(this, scan)){
						System.out.println("\n"+option+" Data Updated in Database.");
						return true;
					}
					else
						System.out.println("Fatal error");
					}
					
				case "DOC" -> {
					// Update DOCTOR DataBase
					if (dao.updateDocData(this, scan)){
						System.out.println("\n"+option+" Data Updated in Database.");
						return true;
					}
					else
						System.out.println("Fatal error");
				}
					
				default -> {System.out.println("Please provide valid respose.");}
			}
			return false;
		}

	
	void displayDashUser(String id){
		System.out.println("\n\tWelcome Admin "+id);
		System.out.println("1. Update Data");
		System.out.println("2. Update Profile");
		System.out.println("3. Logout");
	}

	private boolean updateProfile(Scanner scan) {
		System.out.println("Enter your name : ");
		this.id = scan.nextLine();
		return true;
	}
}
