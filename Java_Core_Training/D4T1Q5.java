/*
5(L1). Write a Java program to sort an array of positive integers of a given array. 
In the sorted array the value of the first element should be maximum, second value should be minimum value, 
third should be the second maximum, fourth second be second minimum and so on.
*/
public class D4T1Q5 {
    public static void main(String[] args) {
        int[] arr = new int[] {2,4,5,9,8,3,1};

        altersort(arr);
    }

    static void altersort(int[] arr){
        // implemented through selection sort.
        // Odd locations need Decending order selection sort.
        for (int i = 0; i < arr.length-1; i+=2) {
            for (int j = i+1; j < arr.length; j++) {
                // Maximum
                if (arr[i] < arr[j]) {
                    // Swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // Even locations need Ascending order selection sort.
        for (int i = 1; i < arr.length-1; i+=2) {
            // Here we just need to check the even slots only
            for (int j = i+2; j < arr.length; j+=2) {
                // Minimum
                if (arr[i] > arr[j]) {
                    // Swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Display
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
