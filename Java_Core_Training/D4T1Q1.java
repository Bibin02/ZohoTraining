/*
1(L1).Write a Java program to sort a numeric array and a string array.
*/

import java.util.Scanner;

public class D4T1Q1 {
    public static void main(String[] args) {
        int n = 5;
        int[] numarr = new int[n];
        String[] strarr = new String[n];
        Scanner sc = new Scanner(System.in);

        // Inserting
        for (int i = 0; i < n; i++) {
            numarr[i] = (int)(Math.random()*100);
            System.out.println("String Object input "+(i+1)+":");
            strarr[i] = sc.nextLine();
        }
        sc.close();

        // Display unsorted numarr.
        display(numarr);
        // Display unsorted numarr.
        display(strarr);
        

        numarr = sort(numarr);
        strarr = sort(strarr);

        // Display sorted numarr.
        display(numarr);
        // Display sorted strarr.
        display(strarr);
        

        
    }

    private static String[] sort(String[] strarr) {
        for (int i = 0; i < strarr.length - 1; i++) {
            for (int j = i+1; j < strarr.length; j++) {
                // comparing using Lexicographical order
                // compareTo method compares 2 objects and returns an int value.
                if (strarr[i].compareTo(strarr[j]) > 1) {
                    // Swap
                    String temp = strarr[i];
                    strarr[i] = strarr[j];
                    strarr[j] = temp;
                }
            }
        }
        return strarr;
    }

    private static int[] sort(int[] numarr) {

        // Bubble sort in Ascending order
        for (int i = 0; i < numarr.length - 1; i++) {
            for (int j = i+1; j < numarr.length; j++) {
                if (numarr[i] > numarr[j]) {
                    // Swap
                    int temp = numarr[i];
                    numarr[i] = numarr[j];
                    numarr[j] = temp;
                }
            }
        }
        return numarr;
    }

    private static void display(Object[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    private static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
