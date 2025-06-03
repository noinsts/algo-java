import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Matrix {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            String[] parts = sc.readLine().split(" ");

            int cols = Integer.parseInt(parts[0]);
            int rows = Integer.parseInt(parts[1]);

            int[][] matrix = createMatrix(rows, cols);
            fillMatrix(matrix);
            printMatrix(matrix);
        }
    }

    private static int[][] createMatrix(int rows, int cols) {
        return new int[cols][rows];
    }

    private static void fillMatrix(int[][] matrix) {
        int counter = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = counter++;
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
