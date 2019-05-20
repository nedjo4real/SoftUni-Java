package Introduction.exersices;

import java.util.Scanner;
//Print and Sum
public class Print_and_Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());

        int sum = 0;

        for (int i = n; i <= m; i++) {
            System.out.print(i + " ");
            sum+=i;
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
