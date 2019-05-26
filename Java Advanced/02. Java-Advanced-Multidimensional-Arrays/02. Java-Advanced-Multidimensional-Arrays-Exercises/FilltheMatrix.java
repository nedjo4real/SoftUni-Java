import java.util.Scanner;

public class FilltheMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");

        int size = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix = new int[size][size];

        if (pattern.equals("A")) {
            matrix = generateMatrixWithPattern(size);
        } else {
            matrix = generateMatrixWithPattern2(size);
        }

        printMatrix(matrix);
    }

    private static int[][] generateMatrixWithPattern(int size) {
        int matrix[][] = new int[size][size];

        int value = 1;
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                matrix[row][col] = value;
                value++;
            }
        }
        return matrix;
    }

    public static int[][] generateMatrixWithPattern2(int size) {
        int matrix[][] = new int[size][size];

        int value = 1;

        for (int col = 0; col < size; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < size; row++) {
                    matrix[row][col] = value;
                    value++;
                }
            } else {
                for (int row = size - 1; row >= 0; row--) {
                    matrix[row][col] = value;
                    value++;
                }
            }
        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
