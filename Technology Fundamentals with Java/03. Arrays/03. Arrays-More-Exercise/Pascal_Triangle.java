import java.util.Scanner;
import java.util.Arrays;
//Pascal Triangle
public class Pascal_Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int[][] arr = new int[n][];

        for (int i = 0; i < n; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                if (j > 0 && j < arr[i].length - 1) {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                } else {
                    arr[i][j] = 1;
                }
            }
        }
        for (int[] ar : arr) {
            for (int num : ar) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
