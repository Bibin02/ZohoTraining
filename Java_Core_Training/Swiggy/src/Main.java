import java.util.Scanner;

public class Main extends AbstractInputReader implements Runnable{
    public static void main(String[] args){
		// Clear the screen
        CLRSCR();

		// New Thread t for loading data in parallel.
		Thread t = new Thread(new Main());
		t.start();

		Scanner sc = new Scanner(System.in);
		boolean kill = false;
		do{
			CLRSCR();
			displayDash();
			AbstractInputReader io = new Main();
			// Enhanced Switch statement.
			String option = sc.nextLine();
			switch(option){
				case "1" -> {
					// Input the User Credentials
					System.out.println("\n\tUser Login");
					String id = io.getIDInput(sc);
					String pass = io.getPassInput(sc);
					
					DAO Dataobj = new DAO();
					User instance = Dataobj.login(id, pass);
					if (instance != null){
						instance.operations(sc);
					}
					else{
						System.out.println("Invalid User Credentials / User Not Found .");
					}
					delay(2000);
				}
				case "2" -> {
					// New User Register.
					DAO Dataobj = new DAO();
					String id = io.getIDInput(sc);
					String pass = io.getPassInput(sc);
					System.out.println("Please Provide your current location :");
					String loc = sc.nextLine();
					if (Dataobj.createUser(id, pass, loc)){
						System.out.println("User "+id+" Created Sucessfully.");
					}
					else{
						System.out.println("DB ERROR.");
					}
					delay(2000);
					
				}
				case "3" -> {System.out.println("\nThank You !!"); kill = true;}
				default -> {System.out.println("Please provide valid respose.");}
			}
		}while(!kill);
		sc.close();
    }
	
	private static void displayDash(){
		System.out.println("\n\n\tWelcome To (SWIGGY) Portal\n");
		System.out.println("1. User Login");
		System.out.println("2. New User Register");
		System.out.println("3. Quit Software");
		System.out.println("\n\tHave A Nice Day !!\n");
		System.out.print("==>>> ");
	}
	
	@Override
	public String getPassInput(Scanner scan){
		System.out.print("Password : ");
		return scan.nextLine();
	}
	
	@Override
	public String getIDInput(Scanner scan){
		System.out.print("ID Please : ");
		return scan.nextLine();
	}
    
	public static void CLRSCR(){
		// Clear the console screen 
		try{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		}
		catch(Exception e){
			System.out.println("Error occured");
		}
	}

	public static void delay(int millisec){
		// Providing Delay
		try{
			Thread.sleep(millisec);
		}
		catch(Exception e){
			System.out.println("Error occured");
		}
	}

	@Override
	public void run(){
		DAO.loadData();
	}
}