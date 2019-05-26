import java.lang.management.MonitorInfo;
import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    private static int[][] matrix;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] rowsCols = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = rowsCols[0];
        int cols = rowsCols[1];
        matrix = new int[rows][];
        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int maxSum = -1;
        int rowi = 0;
        int coli = 0;
        for (int row = 1; row < rows - 1; row++) {
            for (int col = 1; col < cols - 1; col++) {
                int currentSum = getMatrixSum(row, col);
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    rowi = row;
                    coli = col;
                }
            }
        }
        System.out.println("Sum = " + maxSum);
        printMatrix(rowi, coli);

    }

    private static void printMatrix( int rows, int cols) {
        if (rows == -1 || cols == -1) {
            System.out.println("Result Not Found");
        } else {
            int beginRow = rows - 1;
            int beginCol = cols - 1;

            for (int r = beginRow; r < beginRow + 3; r++) {
                for (int c = beginCol; c < beginCol + 3; c++) {
                    System.out.print(matrix[r][c] + " ");
                }
                System.out.println();
            }
        }
    }

    private static int getMatrixSum(int row, int col) {
        int sum = 0;
        sum += matrix[row][col];
        sum += matrix[row - 1][col];
        sum += matrix[row + 1][col];
        sum += matrix[row][col + 1];
        sum += matrix[row][col - 1];
        sum += matrix[row + 1][col + 1];
        sum += matrix[row - 1][col - 1];
        sum += matrix[row - 1][col + 1];
        sum += matrix[row + 1][col - 1];

        return sum;
    }
}