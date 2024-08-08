/*
4(L2).Two numbers are entered through the keyboard. 
Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method).
*/

import java.util.Scanner;

public class D2T1Q4 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt(), b = sc.nextInt();
pow(a, b);
sc.close();

}

static void pow(int a, int b){
int prod = 1;
for (int i = 0; i < b; i++) {
prod *= a;
}
System.out.println(prod);
}
}
