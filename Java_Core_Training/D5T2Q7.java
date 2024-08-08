/*
7. (L2)Write a program to get the input from the user and store it into file. Using Reader and Writer file.
*/
import java.io.*;

public class D5T2Q7{
	public static void main(String[] args){
		try {
			File f1 = new File("fileoperation.txt");
			File f2 = new File("fileoperation2.txt");
			
			if(f1.exists() == false){
				f1.createNewFile();
			}
			if(f2.exists() == false){
				f2.createNewFile();
			}
			// Read Context. using Reader class
			FileReader fr = new FileReader(f1);
			
			// Write Context. using Writer class
			FileWriter fw = new FileWriter(f2);

			// Reading and Writing single Charecter simultaneously.
			int c;
			do {
				c = fr.read();
				fw.write((char) c);
			} while (c >= 0);

			System.out.println("File contents copied Sucessfully.");
			fr.close();
			fw.close();
		}
		catch (IOException io){
			System.out.println("IOException occured"); 
		}
	}
}