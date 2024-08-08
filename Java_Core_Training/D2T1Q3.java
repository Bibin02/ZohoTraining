/*
3(L1).Write a program in Java to display the n terms of odd natural number and their sum.

Input number of terms is: 5

Expected Output :

The odd numbers are :                                                            

1                                                                                

3                                                                                

5                                                                                

7                                                                                

9                                                                                

The Sum of odd Natural Number up to 5 terms is: 25
*/

import java.util.Scanner;

public class D2T1Q3 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int till = sc.nextInt(),counter = 1, sum = 0;
sc.close();

// Optimized Approach
System.out.println(till * till);

// Normal Approach
while (till != 0) {
sum+=counter;
counter+=2;
till--;
}

System.out.println(sum);

}
}
