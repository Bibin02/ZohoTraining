/*
7(L1).Write a Java program to check if two given strings are rotations of each other.
Sample Output:
The given strings are: ABACD and CDABA
The concatenation of 1st string twice is: ABACDABACD
The 2nd string CDABA exists in the new string.
Strings are rotations of each other
*/
public class D4T2Q7 {
    public static void main(String[] args) {
        String str1 = "ABACD";
        String str2 = "CDABA";

        System.out.println(isRotated(str1, str2));
    }

    static boolean isRotated(String str1, String str2) {
        String c = str1 + str2;
        // if finds an occurence,
        if (c.indexOf(str2) > 0) {
            return true;
        }
        return false;
    }
}
