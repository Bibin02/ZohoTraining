/**
 * T1Q1
 * 1(L1). Write a Java program that takes a number as input and prints its multiplication table up to 10.
 */
import java.util.Scanner;

class T1Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(n +" x " + i +" = " + n*i);
        }
        sc.close();
    }
    
}

