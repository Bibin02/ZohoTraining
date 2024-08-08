/*
4. (L2)Write a program to create a directory and check whether the directory is created.
*/
import java.io.*;

public class D5T2Q4{
	public static void main(String[] args){
		try {
			File fo = new File("Directory_For_Training");
			
			// Check directory already created.
			if(fo.isDirectory()){
				System.out.println("Directory created Already");
				return;
			}
			
			// create directory
			fo.mkdir();
			
			// Check directory created.
			if(fo.isDirectory()){
				System.out.println("Directory created successfully"); 
			}
			
		}
		catch (Exception io){
			System.out.println("IOException occured"); 
		}
	}
}