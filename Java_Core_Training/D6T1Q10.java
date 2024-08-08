/*
10(L2). Write a Java program to count the number of decimal places in a given number.
 */

 public class D6T1Q10 {

    public static int countDecimalPlaces(String numStr) {

        int decimal = 0;

        if (numStr.matches(".*\\.[0-9]+")) {
            decimal = numStr.split("\\.")[1].length();
        }

        return decimal;
    }

    public static void main(String[] args) {
        String num1 = "3.14159";
        String num2 = "12345";
        String num3 = "0.00123";

        System.out.println("Number of decimal places in " + num1 + ": " + countDecimalPlaces(num1));
        System.out.println("Number of decimal places in " + num2 + ": " + countDecimalPlaces(num2));
        System.out.println("Number of decimal places in " + num3 + ": " + countDecimalPlaces(num3));
    }
}
