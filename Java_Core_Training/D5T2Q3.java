/*
3. (L1)Write a program to rename the given file, 
after renaming the file delete the renamed file. 
(Accept the file name using command line arguments.)
*/
import java.io.*;

public class D5T2Q3{
	public static void main(String[] args){
		try {
			File fo = new File(args[0]);
			
			if(fo.exists() == false){
				fo.createNewFile();
			}
			
			// File Renaming
			System.out.println("New Filename :"+fo.getName());

			// Delete file
			if(fo.delete()){
				System.out.println("File Deleted Sucessfully."); 
			}
			else{
				System.out.println("IOException occured"); 
			}
		}
		catch (IOException io){
			System.out.println("IOException occured"); 
		}
	}
}