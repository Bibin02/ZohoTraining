/*
1(L1).Write a Java program to check whether a string contains only a certain set of characters (in this case a-z, A-Z and 0-9).
 */

import java.util.regex.*;
public class D6T1Q1 {
    public static void main(String[] args) {
        String str = "apple123";
        String regex = "[a-zA-Z0-9]{0,}";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);

        if (m.matches()) {
            System.out.println("IsAlpha Numeric");
        }
        else{
            System.out.println("Not an alphanumeric");
        }
    }
    
}