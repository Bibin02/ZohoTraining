/*
11(L3). Write a Java program to validate a personal identification number (PIN). Assume the length of a PIN number is 4, 6 or 8.
 */

import java.util.regex.*;
import java.util.*;

public class D6T1Q11 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Pin : ");
        String str = sc.nextLine();
		sc.close();
		
		String regex = "[0-9]{4}|[0-9]{6}|[0-9]{8}";
		
        if (Pattern.matches(regex, str)) {
            System.out.println("Valid Pin");
        }
		else{
			System.out.println("Invlid Pin");
		}
    }
}