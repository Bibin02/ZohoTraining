/*
6(L2).Write a Java program to replace every element with the next best element (from right side) in a given array of integers. 
There is no element next to the last element, therefore replace it with -1.
*/
public class D4T1Q6 {
    public static void main(String[] args) {
        int[] arr = new int[] {2,4,5,9,8,3,1};

        nextBestElement(arr);
    }

    static void nextBestElement(int[] arr){

        // Odd locations need Decending order selection sort.
        int i = 0;
        while (i < arr.length-1) {
            int j = i, maxloc = i;
            while (j < arr.length) {
                // finding maxlocation
                if (arr[j] > arr[maxloc]) {
                    maxloc = j;
                }
                j++;
            }
            // Setting all values as maximum vals previous to maxloc.
            for (int k = i; k < maxloc; k++) {
                arr[k] = arr[maxloc];
            }
            i = maxloc + 1;
        }

        // Since last element is always -1.
        arr[arr.length - 1] = -1;

        // Display
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
