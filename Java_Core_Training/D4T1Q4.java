/*
4(L2).Write a Java program to print all the LEADERS in the array.   
Note: An element is leader if it is greater than all the elements to its right side.
*/
public class D4T1Q4 {
    public static void main(String[] args) {
        int[] arr = new int[] {2,4,5,9,8,3,1};

        printLeaders(arr);
    }

    static void printLeaders(int[] arr) {
        int count = 1;
        for (int i = arr.length - 1; i > 0; i--) {
            if (i == arr.length - 1) {
                System.out.println("Leader "+count+++" = "+arr[i]);
            }
            else if (arr[i] > arr[i+1]) {
                System.out.println("Leader "+count+++" = "+arr[i]);
            }
        }
    }
}
