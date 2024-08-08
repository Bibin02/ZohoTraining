import java.util.*;

public class User implements PRINTABLES{
	private String name;
	private String loc;
	public User(String name){
		this.name = name;
	}
	
	void operations(Scanner scan){
		// Cutrrent Location Access.
		System.out.println("Access Location (y/n) :");
		if(scan.nextLine().equals("y")){
			System.out.println("System Using Precise Current Location .");
			Main.delay(2000);
		}
		else{
			System.out.println("System Using Prefered Location .");
			Main.delay(2000);
		}
		
		boolean kill = false;
		do{
			Main.CLRSCR();
			displayDashUser(this.name);
			String option = scan.nextLine();
			
			switch(option){
				case "1" -> {
					// Food Order Menu.
					// This menu is another Thread and main Thread waits till menu executes.
					try {
						Thread menuThread = new Thread(new Menu());
						menuThread.start();
						menuThread.join();
					} catch (Exception e) {
						System.out.println("Menu Thread Dispatch Error.");
					}
				}
				case "2" -> {
					// Update profile (User)
					System.out.println("Name Please .");
					this.name = scan.nextLine();
					// Update Location.
					System.out.println("New Location Please .");
					this.loc = scan.nextLine();
					System.out.println("\nProfile Updated :");
				}
				
				case "3" -> {System.out.println("\nThank You !!"); kill = true;}
				default -> {System.out.println("Please provide valid respose.");}
			}
		}while(!kill);
	}
	
	@Override
	public void displayDashUser(String id){
		System.out.println("\n\tWelcome "+name);
		System.out.println("1. Order Food near ,"+this.loc);
		System.out.println("2. Update Profile & Location.");
		System.out.println("3. Logout.");
	}
}