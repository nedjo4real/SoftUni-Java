package Introduction.lab;

import java.util.Scanner;
//Multiplication Table
public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int res = 0;

        for (int i = 1; i <= 10; i++) {
            res = num*i;
            System.out.println(num + " X " + i + " = " + res);
        }
    }
}
