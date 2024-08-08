/*
9(L2).Given two sorted arrays A and B of size p and q, 
write a Java program to merge elements of A with B by maintaining the sorted order 
i.e. fill A with first p smallest elements and fill B with remaining elements.
Input :
int[] A = { 1, 5, 6, 7, 8, 10 }
int[] B = { 2, 4, 9 }
Output:
Sorted Arrays:
A: [1, 2, 4, 5, 6, 7]
B: [8, 9, 10]
*/
public class D4T1Q9 {
    public static void main(String[] args) {
        int[] A = new int[]{ 1, 5, 6, 7, 8, 10 };
        int[] B = new int[]{ 2, 4, 9 };

        int[][] mat = sortAB(A, B);

        // Display A
        for (int i = 0; i < mat[0].length; i++) {
            System.out.print(mat[0][i]+" ");
        }
        System.out.println();
        // Display B
        for (int i = 0; i < mat[1].length; i++) {
            System.out.print(mat[1][i]+" ");
        }
    }

    static int[][] sortAB(int[] a, int[] b) {
        int[][] matrix = new int[2][a.length > b.length ? a.length : b.length];
        // Sorting is used.
        // Selection sort in Ascending order
        for (int i = 0; i < a.length + b.length - 1; i++) {
            for (int j = i+1; j < a.length + b.length ; j++) {

                if (i >= a.length && j >= a.length) {
                    // Swaping condition 1
                    if (b[i - a.length] > b[j - a.length]) {
                        // Swap
                        int temp = b[i - a.length];
                        b[i - a.length] = b[j - a.length];
                        b[j - a.length] = temp;
                    }
                }
                else if (j >= a.length) {
                    // Swaping condition 2
                    if (a[i] > b[j - a.length]) {
                        // Swap
                        int temp = a[i];
                        a[i] = b[j - a.length];
                        b[j - a.length] = temp;
                    }
                }
                else{
                    // Swaping condition 3
                    if (a[i] > a[j]) {
                        // Swap
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
        }
        matrix[0] = a;
        matrix[1] = b;
        return matrix;
    }
}
