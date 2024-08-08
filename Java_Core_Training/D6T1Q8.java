/*
8(L2)Write a Java program to find the word Python in a given string, 
if the word Python present in the string return Java otherwise return C++. Ignore case-sensitive.
 */

import java.util.regex.Pattern;

public class D6T1Q8 {
    public static void main(String[] args) {
        String str = "Java python Fortran C++ python";
		String regex = "python";
		String[] words = Pattern.compile(" ").split(str);
		
		for (String string : words){
			if (Pattern.matches(regex, string)) {
				System.out.println("Java");
			}
			else{
				System.out.println("C++");
			}
		}
    }
}