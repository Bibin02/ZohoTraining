/*
 Application SET-B

1.Search a file or directory  in your explorer system with respect to drives using Java and JNI.
*/
import java.util.*;
public class D9T2Q1 {
	static {
		System.loadLibrary("fileoperations");
	}
	
	public static native boolean findFile(String path, String filename);
	public static native boolean gotoPath(String path);
	public static native boolean lsCommand();
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		boolean kill = false;
		do{
			displayDash();
			// Enhanced Switch statement.
			String option = sc.nextLine();
			switch(option){
				case "1" -> {
					// Search file.
					System.out.println("Enter the Searching File Name : ");
					if (findFile(".",sc.nextLine())){
						System.out.println("File found.");
					}
					else
						System.out.println("File Not Found");
					
				}
				case "2" -> {
					// Go to Directory.
					System.out.println("Enter the Path : ");
					String path = sc.nextLine();
					
					if (gotoPath(path)){
						System.out.println("Inside Path :"+path);
					}
					else
						System.out.println("Path Not Found");
					
				}
				case "3" -> {
					// Search in Directory.
					System.out.println("Enter the Searching File Name : ");
					String filename = sc.nextLine();
					System.out.println("Enter the Path : ");
					String path = sc.nextLine();
					
					if (findFile(path,filename)){
						System.out.println("File found.");
					}
					else
						System.out.println("File Not Found");
					
				}
				case "4" -> {
					// print contents in Directory.
					lsCommand();
					
				}
				case "5" -> {System.out.println("\nThank You !!"); kill = true;}
				default -> {System.out.println("Please provide valid respose.");}
			}
		}while(!kill);
		sc.close();
    }
	
	private static void displayDash(){
		System.out.println("\n\n\tFile Management using JNI.\n");
		System.out.println("1. Search File");
		System.out.println("2. Go to Directory");
		System.out.println("3. Search In Directory");
		System.out.println("4. Print Contents in Directory");
		System.out.println("5. Quit Software");
		System.out.println("\n\tHave A Nice Day !!\n");
		System.out.print("==>>> ");
	}
    
}