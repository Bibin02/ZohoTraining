/*
2(L2).Write a Java program to compare two strings lexicographically. 
Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.
 */
public class D4T2Q2 {
    public static void main(String[] args) {
        String str1 = "world";
        String str2 = "world";

        // using Hashvalue
        if (str1.hashCode() == str2.hashCode()) {
            System.out.println("Both are Equal");
        }
        else
            System.out.println("Not Equal");

        // using brute force;
        compare(str1, str2);
    
    }

    static void compare(String str1, String str2) {
        if (str1.length() != str2.length()) {
            System.out.println("not Equal length");
            return;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                System.out.println("Not Equal");
                return;
            }
        }
        System.out.println("Equal");
        return;
    }
    
}
