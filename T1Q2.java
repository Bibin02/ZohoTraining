/**
 * T1Q2
 * 2(L1). Write a Java program to swap two variables.
 */
public class T1Q2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("A = "+a +" B = "+b);

        // Temporary Variable Method

        int temp = a;
        a = b;
        b = temp;
        System.out.println("A = "+a +" B = "+b);

        // Without temporary variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("A = "+a +" B = "+b);

    }
    
}