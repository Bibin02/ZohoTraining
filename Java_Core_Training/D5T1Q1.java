/*
(L1)Write a program to illustrate how to throw an exception.
*/
public class D5T1Q1 {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            // Printing the Exception.
            e.printStackTrace();
        }
    }
}
