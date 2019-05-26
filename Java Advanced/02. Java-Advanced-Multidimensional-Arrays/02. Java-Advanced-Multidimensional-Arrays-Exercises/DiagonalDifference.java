import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class DiagonalDifference {
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
        int sum1 = 0;
        while (i < range) {
            sum1 += matrix[i++][j++];
        }
        j = 0;
        i = range;
        int sum2 = 0;
        while (i > 0) {
            sum2 += matrix[--i][j++];

        }

        sum1 -= sum2;
        System.out.println(Math.abs(sum1));
    }
}