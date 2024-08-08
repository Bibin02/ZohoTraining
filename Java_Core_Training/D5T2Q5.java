/*
5. (L2)Write a program to create a file and write data into it using the methods of OutputStream class.
*/
import java.io.*;

public class D5T2Q5{
	public static void main(String[] args){
		try {
			File fo = new File("fileoperation.txt");
			
			if(fo.exists() == false){
				fo.createNewFile();
			}
			// Write file context.
			FileOutputStream fos = new FileOutputStream(fo);
			
			String content = "Writing Context into file Using FileOutputStream object.";
			byte[] bytearray = new byte[content.length()];
			int i = 0;
			for (char c : content.toCharArray()){
				bytearray[i] = (byte)c;
				i++;
			}
			
			// write method accepts byte[] as input.
			fos.write(bytearray);
			System.out.println("Content Written into the file Sucessfully"); 
			fos.close();
			
		}
		catch (IOException io){
			System.out.println("IOException occured"); 
		}
	}
}