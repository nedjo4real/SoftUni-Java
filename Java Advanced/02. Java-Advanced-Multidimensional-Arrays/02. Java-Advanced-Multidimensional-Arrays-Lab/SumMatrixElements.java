import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ranges = Arrays.stream(scan.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int m = ranges[0];
        int n = ranges[1];
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            int[] arr = Arrays.stream(scan.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int k = 0; k < arr.length; k++) {
                matrix[i][k] = arr[k];
            }
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println(m);
        System.out.println(n);
        System.out.println(sum);
    }
}