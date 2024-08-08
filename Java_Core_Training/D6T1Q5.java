/*
5(L3). Write a Java program that matches a word containing 'g', not at the start or end of the word.
 */

import java.util.regex.Pattern;

public class D6T1Q5 {
    public static void main(String[] args) {
        String str = "akgdhj";
		String regex = "[^g].*[^g]";

        if (Pattern.compile(regex).matcher(str).find()) {
            System.out.println("Pattern found");
        }
		else{
			System.out.println("Pattern Not found");
		}
    }
}