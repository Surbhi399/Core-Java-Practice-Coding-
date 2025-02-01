import java.util.Scanner;

public class Transpose {
    public static int[][] transpose(int[][] A) {
    int numRows =A.length;
    int numCols = A[0].length;

    // Create a new matrix to store the transposed values
    int [][] transposedMatrix =  new int[numCols][numRows];

        for(int i = 0;i<numRows;i++)

    {
        for (int j = 0; j < numCols; j++) {
            transposedMatrix[j][i] = A[i][j];
        }
    }

        return transposedMatrix;
}


    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = s.nextInt();
        System.out.print("Enter the number of columns: ");
        int  column = s.nextInt();
      int[][] A = new int[row][column];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {

                A[i][j] = s.nextInt();

            }}
        /*for (int[] ints : A) {
            for (int anInt : ints) {

                System.out.print(anInt);

            }
            System.out.println(" ");
        }

        int [][] transposedMatrix =transpose(A);*/
        System.out.println("\nTransposed Matrix:");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(A[j][i] + " ");// replace  transposedMatrix [j][i] from line of code
            }
            System.out.println();
        }

        s.close();

        Integer x = 10;
        Integer y = 10;

        if (x == y) System.out.println("Equal");
        else System.out.println("Not equal");
    }
}
