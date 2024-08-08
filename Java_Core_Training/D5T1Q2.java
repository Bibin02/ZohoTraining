/*
(L1)Write a program using try and catch block where check whether the given array size is negative or not.
 */
public class D5T1Q2 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[-1];
            arr[0] = 100;
        } catch (Exception e) {
            System.out.println("Array size could not be negative");
        }
    }
}
