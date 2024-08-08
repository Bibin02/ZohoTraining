/*
4(L2).Write a Java program that matches a string that has a 'p' followed by anything, ending in 'q'.
 */
import java.util.regex.*;
public class D6T1Q4 {
    public static void main(String[] args) {
        String str = "poiuytrewq";
		String regex = "p.*q";

        if (Pattern.matches(regex, str)) {
            System.out.println("Pattern found");
        }
		else{
			System.out.println("Pattern Not found");
		}
    
    }
    
}