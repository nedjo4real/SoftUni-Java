package Introduction.exersices;

import java.util.Scanner;
//Triangle of Numbers
public class Triangle_of_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row+" ");
            }
            System.out.println();;
        }
    }
}
