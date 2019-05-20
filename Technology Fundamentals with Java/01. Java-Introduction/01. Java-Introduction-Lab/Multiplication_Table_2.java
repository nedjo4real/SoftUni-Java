package Introduction.lab;

import java.util.Scanner;
//Multiplication Table 2.0
public class Multiplication_Table_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int res = 0;

            if(num2<10){
                for (int j = num2; j <= 10; j++) {
                    res = num * j;
                    System.out.println(num + " X " + j + " = " + res);
                }
            }else {
                res = num * num2;
                System.out.println(num + " X " + num2 + " = " + res);
            }
    }
}
