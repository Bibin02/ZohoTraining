/*
(L1)Write a program to illustrate how to throw a NumberFormatException.
*/
import java.util.Scanner;
public class D5T1Q10 {
    public static void main(String[] args) {
        try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Returning 2X the number :");
			int input = sc.nextInt();
			System.out.println(input * 2);
			sc.close();
		}
        catch (Exception nfe) {
            System.out.println("NumberFormatException thrown not a number");
        }
    }
}
