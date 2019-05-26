import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] dimentions = Arrays.stream(scan.nextLine().split("\\s++"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int firstMatrixRows = dimentions[0];
        int firstMatrixCols = dimentions[1];

        int[][] firstMatrix = new int[firstMatrixRows][];

        for (int i = 0; i < firstMatrixRows; i++) {
            int[] arr = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            firstMatrix[i] = arr;
        }

        dimentions = Arrays.stream(scan.nextLine().split("\\s++"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int secondMatrixRows = dimentions[0];
        int secondMatrixCols = dimentions[1];

        int[][] secondMatrix = new int[secondMatrixRows][];

        for (int i = 0; i < secondMatrixRows; i++) {
            int[] arr = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            secondMatrix[i] = arr;
        }

        if (matricesAreEqual(firstMatrix, secondMatrix) == true) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }
    private static boolean matricesAreEqual(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }
        for (int row = 0; row < firstMatrix.length; row++) {
            if (firstMatrix[row].length != secondMatrix[row].length) {
                return false;
            }
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }
}
