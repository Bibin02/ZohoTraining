/*
6(L1)Write a Java program to match a string that contains only upper and lowercase letters, numbers, and underscores.
 */

import java.util.regex.Pattern;

public class D6T1Q6 {
	public static void main(String[] args) {
		String str = "Alpha_123";
		String regex = "[a-zA-Z0-9_]{"+str.length()+"}";

        if (! Pattern.matches(regex, str)) {
            System.out.println("Pattern found");
        }
		else{
			System.out.println("Pattern Not found");
		}
	}   
}