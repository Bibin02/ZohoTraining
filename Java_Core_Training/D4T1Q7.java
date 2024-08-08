/*
7(L2). Write a Java program to check if a given array contains a subarray with 0 sum
Input :
nums1= { 1, 2, -2, 3, 4, 5, 6 }
nums2 = { 1, 2, 3, 4, 5, 6 }
nums3 = { 1, 2, -3, 4, 5, 6 }
Output:
Does the said array contain a subarray with 0 sum: true
Does the said array contain a subarray with 0 sum: false
Does the said array contain a subarray with 0 sum: true
*/
public class D4T1Q7 {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 2, -2, 3, 4, 5, 6 };
        int[] arr2 = new int[] { 1, 2, 3, 4, 5, 6 };
        int[] arr3 = new int[] { 1, 2, -3, 4, 5, 6 };

        SubArrayWithZeroSum(arr1);
        SubArrayWithZeroSum(arr2);
        SubArrayWithZeroSum(arr3);
    }

    static void SubArrayWithZeroSum(int[] arr) {
        boolean flag = false;
        int[] index = new int[2];

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(sumofArray(arr, i, j) == 0){
                    flag = true;
                    index[0] = i;
                    index[1] = j;
                }
            }
            if (flag) {
                break;
            }
        }
        // Output
        System.out.println("Does the said array contain a subarray with 0 sum: "+flag+" { firstindex : "+index[0]+" , secondindex : "+index[1]+"}");
    }

    private static int sumofArray(int[] arr, int i, int j) {
        int res = 0;
        for (int x = i; x <= j; x++) {
            res += arr[x];
        }
        return res;
    }
}