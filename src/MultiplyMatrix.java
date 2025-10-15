public class MultiplyMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {12, 29, 31},
                {45, 11, 65},
                {73, 86, 99}
        };

        int[][] matrix2 = {
                {23, 2, 31},
                {45, 5, 65},
                {11, 8, 29}
        };

        System.out.println("Matrix 1:");
        MatrixApp.printMatrix(matrix);
        System.out.println();

        System.out.println("Matrix 2:");
        MatrixApp.printMatrix(matrix2);
        System.out.println();

        System.out.println("Multiplying Matrix:");

        int[][] multpmatrix = MatrixApp.matrixMultiplication(matrix, matrix2);

        MatrixApp.printMatrix(multpmatrix);

    }
}
