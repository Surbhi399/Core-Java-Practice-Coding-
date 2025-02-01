import java.util.Scanner;

public class Transpose {
    
    // Method to transpose a matrix
    public static int[][] transpose(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int[][] transposedMatrix = new int[numCols][numRows];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Input matrix dimensions
            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();
            System.out.print("Enter the number of columns: ");
            int cols = scanner.nextInt();

            // Validate input
            if (rows <= 0 || cols <= 0) {
                System.out.println("Invalid matrix size! Rows and columns must be positive integers.");
                return;
            }

            // Input matrix elements
            int[][] matrix = new int[rows][cols];
            System.out.println("Enter matrix elements:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            // Transpose the matrix
            int[][] transposedMatrix = transpose(matrix);

            // Display transposed matrix
            System.out.println("\nTransposed Matrix:");
            for (int i = 0; i < cols; i++) {
                for (int j = 0; j < rows; j++) {
                    System.out.print(transposedMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
