import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsofSquareMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int range = Integer.parseInt(scan.nextLine());

        int[][] matrix = new int[range][range];
        for (int i = 0; i < range; i++) {
            int[] arr = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int k = 0; k < arr.length; k++) {
                matrix[i][k] = arr[k];
            }
        }
        int i = 0;
        int j = 0;
        while (i < range) {
            System.out.print(matrix[i++][j++] + " ");
        }
        j = 0;
        i = range;
        System.out.println();
        while (i > 0) {
            System.out.print(matrix[--i][j++] + " ");

        }
    }
}