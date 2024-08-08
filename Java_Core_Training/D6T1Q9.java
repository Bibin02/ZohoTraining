/*
9(L2)Write a Java program to remove all the vowels of a given string. Return the new string.
 */

 import java.util.regex.*;
 public class D6T1Q9 {

    public static String removeVowels(String str) {
		String regex = "[aeiouAEIOU]";
		String result = "";
        String[] nonvovels = Pattern.compile(regex).split(str);
		
		for (String string : nonvovels){
			result += string;
		}
		
		return result;
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        String result = removeVowels(input);
        System.out.println("Original string: " + input);
        System.out.println("String after removing vowels: " + result);
    }
}
