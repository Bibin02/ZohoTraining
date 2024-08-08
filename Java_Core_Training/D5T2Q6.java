/*
6. (L2)Write a program to accept a specified number of characters as input and converts them into uppercase characters.
*/
import java.io.*;
import java.util.Scanner;

public class D5T2Q6{
	public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Give the no. of charectors : ");
			int count = sc.nextInt(); 
			String str = "";
			BufferedInputStream bf = new BufferedInputStream(System.in);
			while (count > 0) {
				Character c = (char)bf.read();
				str += Character.toUpperCase(c);
				count--;
			}
			System.out.println(str);
		}
		catch (Exception io){
			System.out.println("IOException occured"); 
		}
	}
}