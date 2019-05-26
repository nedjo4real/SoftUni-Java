import java.util.Arrays;
import java.util.Scanner;

public class FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[][] matrix = new char[8][8];
        for (int i = 0; i < 8; i++) {
            String[] arr = scan.nextLine().split("\\s+");

            for (int k = 0; k < arr.length; k++) {
                matrix[i][k] = arr[k].charAt(0);
            }
        }

        int resi = 0;
        int resj = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matrix[i][j] == 'q') {
                    if (diagonalCheck(matrix, i, j) == true) {
                        if (horizontalCheck(matrix, i, j) == true) {
                            System.out.println(i + " " + j);
                        }
                    }
                }
            }
        }
    }

    public static boolean diagonalCheck(char matrix[][], int a, int b) {
        int i = a;
        int j = b;
        while (i != 7 && j != 7) {
            if (matrix[++i][++j] == 'q') {
                return false;
            }
        }
        i = a;
        j = b;
        while (i > 0 && j != 7) {
            if (matrix[--i][++j] == 'q') {
                return false;
            }
        }
        i = a;
        j = b;
        while (i != 0 && j != 0) {
            if (matrix[--i][--j] == 'q') {
                return false;
            }
        }
        i = a;
        j = b;
        while (j != 0 && i != 7) {
            if (matrix[++i][--j] == 'q') {
                return false;
            }
        }

        return true;
    }

    public static boolean horizontalCheck(char matrix[][], int a, int b) {
        int i = a;
        int j = b;
        while (i > 0) {
            if (matrix[--i][j] == 'q') {
                return false;
            }
        }
        i = a;
        while (i != 7) {
            if (matrix[++i][j] == 'q') {
                return false;
            }
        }
        i = a;
        while (j != 7) {
            if (matrix[i][++j] == 'q') {
                return false;
            }
        }
        j = b;
        while (j > 0) {
            if (matrix[i][--j] == 'q') {
                return false;
            }
        }
        return true;
    }

}
