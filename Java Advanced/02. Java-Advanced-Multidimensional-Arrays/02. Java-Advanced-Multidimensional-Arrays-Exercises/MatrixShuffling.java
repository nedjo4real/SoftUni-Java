import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] input = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int row = input[0];
        int col = input[1];
        String[][] matrix = new String[row][col];

        for (int i = 0; i < row; i++) {
            String[] arr = scan.nextLine().split("\\s+");
            matrix[i] = arr;
        }

        String[] command = scan.nextLine().split("\\s+");
        while (!command[0].equals("END")) {
            if (!command[0].equals("swap")) {
                System.out.println("Invalid input!");
                command = scan.nextLine().split("\\s+");
                continue;
            } else if (command.length != 5) {
                System.out.println("Invalid input!");
                command = scan.nextLine().split("\\s+");
                continue;
            }
            int rowOne = Integer.parseInt(command[1]);
            int colOne = Integer.parseInt(command[2]);
            int rowTwo = Integer.parseInt(command[3]);
            int colTwo = Integer.parseInt(command[4]);
            if (rowOne < 0 || rowOne > row || colOne < 0 || colOne > col || rowTwo < 0 || rowTwo > row || colTwo < 0 || colTwo > col) {
                System.out.println("Invalid input!");
                command = scan.nextLine().split("\\s+");
                continue;
            } else {
                String test = matrix[rowOne][colOne];
                matrix[rowOne][colOne] = matrix[rowTwo][colTwo];
                matrix[rowTwo][colTwo] = test;
            }
            for (int i = 0; i < matrix.length; i++) {
                if (matrix.length > 1) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print(matrix[i][j]);
                        if (j < matrix[i].length - 1) {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();

                } else {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print(matrix[i][j]);
                        if (j < matrix[i].length - 1) {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
            command = scan.nextLine().split("\\s+");
        }
    }
}