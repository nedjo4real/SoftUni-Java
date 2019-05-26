import java.util.Arrays;
import java.util.Scanner;

public class IntersectionofTwoMatrices {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int rows = Integer.parseInt(scan.nextLine());
        int cols = Integer.parseInt(scan.nextLine());
        char[][] firstMatrix = new char[rows][cols];
        char[][] secondMatrix = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] line = scan.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                firstMatrix[i][j] = line[j].charAt(0);
            }
        }
        for (int i = 0; i < rows; i++) {
            String[] line = scan.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                secondMatrix[i][j] = line[j].charAt(0);
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (firstMatrix[i][j] !=secondMatrix[i][j]) {
                    firstMatrix[i][j] = '*';
                }
                System.out.print(firstMatrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
