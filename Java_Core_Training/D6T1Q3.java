/*
3(L2).Write a Java program to find sequences of lowercase letters joined with an underscore.
 */
import java.util.regex.*;
public class D6T1Q3 {
    public static void main(String[] args) {

        String str = "asf_rug";
		String regex = "[a-z]+[_][a-z]+";

        System.out.println("Pattern found " +Pattern.matches(regex, str));
			
    }
    
}