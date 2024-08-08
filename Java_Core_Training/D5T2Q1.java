/*
(L1)Write a program to show how to read and write a file.
*/
import java.io.*;
import java.util.Scanner;

public class D5T2Q1{
	public static void main(String[] args){
		try {
			File fo = new File("fileoperation.txt");
			
			if(fo.exists() == false){
				fo.createNewFile();
			}
			// Write file context.
			if (fo.canWrite()) {
				FileWriter fr = new FileWriter(fo);
				fr.write("I Write contents in it.");
				fr.close();
			}
			else{
				System.out.println("File writing not possible");
			}
			
			// Read file Context. using Scanner class
			Scanner fs = new Scanner(fo);
			while(fs.hasNext()){
				System.out.println(fs.nextLine()); 
			}
			fs.close();
		}
		catch (IOException io){
			System.out.println("IOException occured"); 
		}
	}
}