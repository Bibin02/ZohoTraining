/*
3(L2).Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.
Sample array: [1,2,4,5,6]
Target value: 6.
*/
public class D4T1Q3 {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,4,5,6}, Target = 6, targetSum[] = new int[2];

        targetSum = findTargetSum(arr, Target);

        System.out.println(targetSum[0]+"->"+arr[targetSum[0]]);
        System.out.println(targetSum[1]+"->"+arr[targetSum[1]]);

    }

    private static int[] findTargetSum(int[] arr, int target) {
        int[] targetSum = new int[2];

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    targetSum[0] = i;
                    targetSum[1] = j;
                }
            }
        }

        return targetSum;
    }
}
