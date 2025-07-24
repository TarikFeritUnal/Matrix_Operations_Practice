import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        System.out.println("\nFill first matrix:");
        MatrixApp.fillMatrix(matrix1);
        System.out.println("\nFirst matrix:");
        MatrixApp.printMatrix(matrix1);

        System.out.println("\nFill second matrix:");
        MatrixApp.fillMatrix(matrix2);
        System.out.println("\nSecond matrix:");
        MatrixApp.printMatrix(matrix2);

        System.out.println("\nSum of the two matrices:");
        int[][] sum = MatrixApp.addMatrices(matrix1, matrix2);
        MatrixApp.printMatrix(sum);

        System.out.println("\nTranspose of the first matrix:");
        int[][] transposed = MatrixApp.transpose(matrix1);
        MatrixApp.printMatrix(transposed);

        sc.close();
    }
}
