package Introduction.exersices;

import java.util.Scanner;
//Strong Number
public class Strong_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numberInput = scan.nextLine();

        long sum = 0;

        for (int i = 0; i < numberInput.length(); i++) {
            int number = Integer.parseInt(String.valueOf(numberInput.charAt(i)));

            int factorial = 1;

            for (int j = 1; j <= number; j++) {
                factorial *= j;
            }
            sum+= factorial;
        }

        System.out.println(numberInput.equals(String.valueOf(sum))? "yes" : "no");

    }
}