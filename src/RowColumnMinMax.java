import java.util.Scanner;

public class RowColumnMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {
                {12, 29, 31},
                {45, 11, 65},
                {73, 86, 99}
        };

        System.out.println("Matrix:");
        MatrixApp.printMatrix(matrix);
        System.out.println();

        System.out.println("1 - Find the smallest element in each row.");
        System.out.println("2 - Find the largest element in each column.");
        System.out.print("Your choice (1/2): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            int[] minInRows = findRowMinimums(matrix);
            System.out.print("Minimum values in each row: ");
            MatrixApp.printArray(minInRows);
        } else if (choice == 2) {
            int[] maxInCols = findColumnMaximums(matrix);
            System.out.print("Maximum values in each column: ");
            MatrixApp.printArray(maxInCols);
        } else {
            System.out.println("Invalid input. Please select 1 or 2.");
        }

        sc.close();
    }

    private static int[] findColumnMaximums(int[][] matrix) {
        int cols = matrix[0].length;
        int[] maxArray = new int[cols];

        for (int j = 0; j < cols; j++) {
            int max = matrix[0][j];
            for (int i = 1; i < matrix.length; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            maxArray[j] = max;
        }
        return maxArray;
    }

    private static int[] findRowMinimums(int[][] matrix) {
        int[] minArray = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            minArray[i] = min;
        }
        return minArray;
    }
}
