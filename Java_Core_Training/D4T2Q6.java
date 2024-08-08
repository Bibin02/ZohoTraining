/*
6(L2).Write a Java program to divide a string into n equal parts.
*/
public class D4T2Q6 {
    public static void main(String[] args) {
        String str = "Here is a Big B";
        int blocs = 3;
        String[] strarr = seperateToN(str, blocs);

        // Display
        for (String string : strarr) {
            System.out.println(string);
        }
    }

    static String[] seperateToN(String str, int bloc) {
        int blockSize = str.length() / bloc, count = 0;
        String[] strarr = new String[blockSize];
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            
            temp += str.charAt(i) + "";

            if (temp.length() % bloc == 0) {
                strarr[count++] = temp;
                temp = "";
            }
            
        }
        return strarr;
    }
}
