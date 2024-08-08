/*
3(L2).Write a Java program to compare two strings lexicographically, ignoring case differences
 */
public class D4T2Q3 {
    public static void main(String[] args) {
        String str1 = "WorlD";
        String str2 = "woRld";

        // using brute force;
        compare(str1, str2);
    
    }

    static void compare(String str1, String str2) {
        if (str1.length() != str2.length()) {
            System.out.println("not Equal length");
            return;
        }
    
        for (int i = 0; i < str1.length(); i++) {
            if (Math.abs(str1.charAt(i) - str2.charAt(i)) != (97-65)) {
                System.out.println("Not Equal");
                return;
            }
        }
        System.out.println("Equal");
        return;
    }
}
