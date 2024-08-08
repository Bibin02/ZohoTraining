/*
2.(L1)Write a program to create a text file in the path c:\java\abc.txt and check whether that file is exists. 
Using the command exists(), isDirectory(), isFile(), getName() and getAbsolutePath().
*/
import java.io.*;

public class D5T2Q2{
	public static void main(String[] args){
		try {
			String path = "Pack1";
			File dir = new File(path);
			File fo = new File("Pack1\\CalculateDigits.java");
			
			if(dir.isDirectory() == false){
				System.out.println("Path not found"); 
			}
			else{
				System.out.println("Absolute path Available, path:"+fo.getAbsolutePath()); 
			}
			if(fo.exists() == false){
				System.out.println("File not found"); 
			}
			else{
				System.out.println("File found at absolute path :"+fo.getAbsolutePath()); 
			}
			if(fo.isFile() == false){
				System.out.println("Not a File"); 
			}
			else{
				System.out.println("File Name :"+fo.getName()); 
			}

		}
		catch (Exception io){
			System.out.println("IOException occured"); 
		}
	}
}