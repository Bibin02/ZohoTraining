/**
2.Create an Online Voting System using JDBC with relational database and it must follows the conditions,

Create a schema having Identity card, Party 1,Party 2,Party 3 fields

Display the parties to the user

After the user clicks or enters the party ID the data will be placed on the respective record

And make another interface for Election controller who counts the results

From your Table the result for each party will be calculated and displayed to the Controller's interface

Make a new interface for getting results for getting results.
 */
import java.util.Scanner;
public class OnlineVotingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean kill = false;
        do {
            displayDash();
            String option = sc.next();
            switch (option) {
                case "1" -> {
                    System.out.print("Enter userid : "); String uid = sc.next();
                    System.out.print("Enter Password : ");
                    Admin admin = Admin.adminLogin(uid, sc.next());
                    if (admin != null) {
                        // Admin Operations.
                        admin.Operations(sc);
                        admin = null;
                    }
                    else{
                        System.out.println("Invalid admin login credentials");
                        System.out.print("Press Enter key to continue ...");
                        sc.next();
                    }
                    
                }
                
                case "2" -> {
                    System.out.println("Cast Vote !");
                    VotingDAO vdao = new VotingDAO();
                    // Display Parties.
                    vdao.displayParties();
                    // Vote Casting.
                    System.out.print("Enter Voter ID : ");
                    String vid = sc.next();
                    System.out.print("Enter Party Number : ");
                    int party = sc.nextInt();
                    
                    if (vdao.castVote(vid, party)) {
                        System.out.println("Voted Sucessfully.");
                    }
                    else{
                        System.out.println("Vote not Added.");
                    }
                    System.out.print("Press Enter key to continue ...");
                    sc.next();
                }
            
                default -> {}

                case "3" -> {kill=true; System.out.println("Thank You !");}
            }
        } while (!kill);
        sc.close();
    }

    private static void displayDash() {
        CLRSCR();
        System.out.println("Online Voting System.");
        System.out.println("1. Admin Login");
        System.out.println("2. Cast vote");
        System.out.println("3. Quit");
        System.out.print("Enter option ==>> ");
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
    
}

class Admin{
    private Admin(){}
    public void Operations(Scanner sc) {
        boolean kill = false;
        AdminDAO adao = new AdminDAO();
        do {
            displayDash();
            String option = sc.next();
            switch (option) {
                case "1" -> {
                    // Insert Voter ID
                    System.out.print("Enter Voter ID : "); 

                    if (adao.insertVoter(this, sc.next())) {
                        System.out.println("Voter Insertion Successful");
                    }
                    else{
                        System.out.println("Voter Insertion Unsuccessful");
                    }
                    System.out.print("Press Enter key to continue ...");
                    sc.next();
                }
                
                case "2" -> {
                    // Delete Voter with ID
                    System.out.print("Enter Voter ID to be Deleted: "); 

                    if (adao.deleteVoter(this, sc.next())) {
                        System.out.println("Voter Deletion Successful");
                    }
                    else{
                        System.out.println("Voter Deletion Unsuccessful");
                    }
                    System.out.print("Press Enter key to continue ...");
                    sc.next();
                }

                case "3" -> {
                    adao.declareResults(this);
                    System.out.print("Press Enter key to continue ...");
                    sc.next();
                }
            
                default -> {}

                case "4" -> {kill=true; System.out.println("Thank You !");}
            }
        } while (!kill);
    }
    private void displayDash() {
        OnlineVotingSystem.CLRSCR();
        System.out.println("Admin Portal");
        System.out.println("1. Insert Voter");
        System.out.println("2. Delete Voter");
        System.out.println("3. Declare Results");
        System.out.println("4. Logout");
        System.out.print("Enter Option ==>> ");
    }
    private static Admin admin;

    static Admin adminLogin(String uname, String pass){

        AdminDAO udao = new AdminDAO();

        if (udao.login(uname, pass)) {
            if (admin == null) {
                return new Admin();
            }
        }
        return admin;
    }
}