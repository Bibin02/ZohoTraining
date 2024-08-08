/*
2(L1).Write a Java program that matches a string that has a p followed by zero or more q's.
 */

import java.util.regex.*;

public class D6T1Q2 {
    public static void main(String[] args) {
        String str = "pqqqq";
		String regex = ".*pq*";

        if (Pattern.matches(regex, str)) {
            System.out.println("Pattern found");
        }
		else{
			System.out.println("Pattern Not found");
		}
		
    }
}