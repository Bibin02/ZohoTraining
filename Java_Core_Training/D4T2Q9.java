/*
9(L3).Write a Java program to create a new string from a given string
by swapping the last two characters of the given string. 
The length of the given string must be two or more.
*/
public class D4T2Q9 {
    public static void main(String[] args) {
        String str1 = "World";
        System.out.println(swapLast2Char(str1));
    }

    static char[] swapLast2Char(String str1) {
        char[] arr = str1.toCharArray();
        // Swapping
        char temp = arr[arr.length-2];
        arr[arr.length-2] = arr[arr.length-1];
        arr[arr.length-1] = temp;
        
        return arr;
    }
}
