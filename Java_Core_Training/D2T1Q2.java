/*
2(L2).Write a Java program that reads a floating-point number and prints "zero" if the number is zero. 
Otherwise, print "positive" or "negative". 
Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
*/

import java.util.Scanner;

public class D2T1Q2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Float fp = sc.nextFloat();
sc.close();
if (fp == 0) {
System.out.println("zero");
}
else
Checkit(fp);
}

static void Checkit(Float fp){
if (fp > 0) {
if (fp > 1000000) {
System.out.println("large positive");
}
else if (fp < 1) {
System.out.println("small positive");
}
else
System.out.println("positive");
}
else if (fp < 0) {
if (fp < -1000000) {
System.out.println("large negative");
}
else if (fp > -1) {
System.out.println("small negative");
}
else
System.out.println("negative");
}
}
}
