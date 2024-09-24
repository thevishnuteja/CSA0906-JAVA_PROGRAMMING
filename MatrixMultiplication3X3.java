import java.util.Scanner;

public class MatrixMultiplication3X3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] result = new int[3][3];

        System.out.println("Enter elements for matrix1 (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements for matrix2 (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Result of matrix multiplication:");
        for (int[] row : result) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
