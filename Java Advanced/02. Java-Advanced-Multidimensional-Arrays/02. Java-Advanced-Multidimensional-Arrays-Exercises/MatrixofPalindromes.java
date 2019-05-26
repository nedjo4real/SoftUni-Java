import java.util.Arrays;
import java.util.Scanner;

public class MatrixofPalindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] rowsCols = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = rowsCols[0];
        int cols = rowsCols[1];
        String[][] matrix = new String[rows][cols];

        String[] alphabet = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        int a = 0;
        int b = 0;
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                matrix[i][j] = alphabet[a] + alphabet[b++] + alphabet[a];
            }
            b -= cols - 1;
            a++;
        }
        printMatrix(matrix, rows, cols);
    }

    public static void printMatrix(String[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}