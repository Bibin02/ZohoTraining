/*
10(L1). Write a Java program to form the largest number from a given list of non-negative integers.
Example:
Input :
nums = {1, 2, 3, 0, 4, 6}
Output:
Largest number using the said array numbers: 643210
 */
public class D4T1Q10 {
    public static void main(String[] args) {

        int[] numarr = new int[]{1, 2, 3, 0, 4, 6};

        // Bubble sort in Decending order
        for (int i = 0; i < numarr.length - 1; i++) {
            for (int j = i+1; j < numarr.length; j++) {
                if (numarr[i] < numarr[j]) {
                    // Swap
                    int temp = numarr[i];
                    numarr[i] = numarr[j];
                    numarr[j] = temp;
                }
            }
        }
        
        // Display
        display(numarr);

    }
    private static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }


}
