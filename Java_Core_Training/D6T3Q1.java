/*
Task 3 (JNI )

1.This exercise demonstrates how to pass an argument from Java to a function implemented in C++.

Primary Goals:

Declare a native method in Java
Implement a native method in C++
Pass arguments to native code from Java 
Pass values back to Java from native code


Implement a C++ function that calculates the area of circle and call it from Java code. 
A calculation is performed in the C++ function and the result is passed back to the Java code. The C++ function implements a native method:

double calculateAreaOfCircle(int radius);

which, as you would expect, calculates the area of a circle given its radius.
*/

import java.util.Scanner;

public class D6T3Q1 {

    // Loading System library.
    static{
        System.loadLibrary("area_calculator");
    }

    static native float calculateAreaOfCircle(int radius);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the Radius of the Circle: ");

        float area = D6T3Q1.calculateAreaOfCircle(sc.nextInt());
        
        System.out.println(area);
        sc.close();
    }
}
