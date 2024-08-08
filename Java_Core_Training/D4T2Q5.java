/*
5(L1).Write a Java program to find the first non repeating character in a string.
*/
public class D4T2Q5 {
    public static void main(String[] args) {
        String str = "Java Programming";

        findFirstOccurance(str);
    }

    static void findFirstOccurance(String str) {
        int[] charpool = new int[256];
        for (char i : str.toCharArray()) {
            charpool[i]++;
        }
        for (char i : str.toCharArray()) {
            if (charpool[i] == 1) {
                System.out.println(i);
                break;
            }
        }
    }
}
