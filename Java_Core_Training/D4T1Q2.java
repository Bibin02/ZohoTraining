/*
2(L1).Write a Java program to add two matrices of the same size.
*/public class D4T1Q2 {
    public static void main(String[] args) {
        int[][] matrix1 = new int[][] {{1, 2, 3},
                                      {4 ,5, 6},
                                      {7, 8, 9}};
        int[][] matrix2 = new int[][] {{1, 2, 3},
                                      {4 ,5, 6},
                                      {7, 8, 9}}, result;
        // Initialization purpose.
        result = matrix2;

        if ((matrix1.length == matrix2.length) && (matrix1[0].length == matrix2[0].length)){
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    // Matrix Addition.
                    result[i][j] =  matrix2[i][j] + matrix1[i][j];
                    // Printing the result.
                    System.out.print(result[i][j]+" ");
                }
                System.out.println();
            }


        }
        else{
            System.out.println("Matrix addition not possible");
        }
        
        
    }
}

