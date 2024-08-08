/**
 * T1Q4
 * 4(L1). Write a Java program to add two binary numbers.
 */
public class D1T1Q4 {
    public static void main(String[] args) {

        int a = 9, b = 18, i = 0, temp = 0;

        while (a >> i != 0) {
            if ((((a >> i) & 1) & ((b >> i) & 1)) == 1){
                temp = (temp << (i+1)) | 1;
            }
            i++;
        }

        System.out.println(a^b^temp);
    }
}