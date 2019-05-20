package Introduction.lab;

import java.util.Scanner;
//Sum of Odd Numbers
public class Sum_of_Odd_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int num = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(num);
            sum+=num;
            num+=2;
        }

        System.out.printf("Sum: %d", sum);
    }
}
