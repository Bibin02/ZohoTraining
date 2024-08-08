import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		boolean kill = false;
		do{
			displayDash();
			// Enhanced Switch statement.
			String option = sc.nextLine();
			switch(option){
				case "1" -> {
					// Input the Admin user Credentials
					System.out.println("\n\tAdmin Login");
					String id = getIDInput(sc);
					int pin = getPINInput(sc);
					
					// Admin updates data.
					Admin instance = Admin.login(id, pin);
					if (instance != null)
						instance.adminOperations(sc);
					else{
						System.out.println("Invalid Admin Credentials.");
					}
				}
				case "2" -> {
					// View Public Data.
					DAO Dataobj = new DAO();
					Dataobj.displayDash(sc);
					
				}
				case "3" -> {System.out.println("\nThank You !!"); kill = true;}
				default -> {System.out.println("Please provide valid respose.");}
			}
		}while(!kill);
		sc.close();
    }
	
	private static void displayDash(){
		System.out.println("\n\n\tWelcome To Flu Analysis Portal\n");
		System.out.println("1. Admin Login");
		System.out.println("2. View Analytics");
		System.out.println("3. Quit Software");
		System.out.println("\n\tHave A Nice Day !!\n");
		System.out.println("Enter the Response to Login : ");
	}
	
	private static int getPINInput(Scanner scan){
		System.out.print("Pin : ");
		return scan.nextInt();
	}
	
	private static String getIDInput(Scanner scan){
		System.out.print("ID Please : ");
		return scan.nextLine();
	}
    
}
