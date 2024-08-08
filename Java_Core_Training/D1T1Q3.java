/**
 * T1Q3
 * 3(L1). Write a program to illustrate the size or range of various data types.
 */
public class D1T1Q3 {
    public static void main(String[] args) {
        int num = 10,count = 0;
        

        while ((num >> 1) != 0) {
            count ++;
            num >>=1;
        }

        System.out.println(count +" Number of Bits");
        System.out.println(Integer.SIZE+" Number of Bits");
    }
}