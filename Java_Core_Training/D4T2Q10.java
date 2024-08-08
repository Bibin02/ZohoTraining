/*
10(L3).Write a Java program to read two strings, append them together and return the result. 
If the strings are different lengths, remove characters from the beginning of the longer string and make them equal length.  
*/

import java.util.Scanner;

public class D4T2Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "GETING SUPER";
        String str2 = "DUPER";
        sc.close();
        System.out.println(trimAppend(str1, str2));
    }

    static char[] trimAppend(String str1, String str2) {
        if (str1.length() == str2.length()) {
            return (str1+str2).toCharArray();
        }
        int lenmin = str1.length() < str2.length() ? str1.length() : str2.length();
        int lenmax = str1.length() > str2.length() ? str1.length() : str2.length();
        char[] charr = new char[2 * lenmin];
        int count = 0;
        for (int i = lenmax - lenmin; i < lenmax; i++){
            charr[count] = str1.charAt(i);
            charr[lenmin+count] = str2.charAt(count++);
        }

        return charr;
    }
}
