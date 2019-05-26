import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOfSubmatrix2x2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] rowsCols = Arrays.stream(sc.nextLine().split(", ")).mapToInt(Integer::valueOf).toArray();
        int[][] matrix = new int[rowsCols[0]][rowsCols[1]];
        int[][] submatrix = new int[2][2];

        for (int i = 0; i < rowsCols[0]; i++) {
            String[] lines = sc.nextLine().split(", ");
            for (int j = 0; j < rowsCols[1]; j++) {
                matrix[i][j] = Integer.parseInt(lines[j]);
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int firstNum = 0;
        int secondNum = 0;
        int thirdNum = 0;
        int fourthNum = 0;

        for (int i = 0; i < rowsCols[0] - 1; i++) {
            for (int j = 0; j < rowsCols[1] - 1; j++) {
                currSum = matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];
                if (currSum > maxSum) {
                    maxSum = currSum;
                    firstNum = matrix[i][j];
                    secondNum = matrix[i][j + 1];
                    thirdNum = matrix[i + 1][j];
                    fourthNum = matrix[i + 1][j + 1];
                }
            }
        }
        System.out.println(firstNum + " " + secondNum);
        System.out.println(thirdNum + " " + fourthNum);
        System.out.println(maxSum);

    }
}