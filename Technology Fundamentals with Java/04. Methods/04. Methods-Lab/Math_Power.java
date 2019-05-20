import java.text.DecimalFormat;
import java.util.Scanner;
//Math Power
public class Math_Power {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double number = Double.parseDouble(scan.nextLine());
        int count = Integer.parseInt(scan.nextLine());

        System.out.println(new DecimalFormat("0.########").format(mathPower(number,count)));
    }

    public static double mathPower(double number, int count){

        double result = Math.pow(number,count);

            return result;
    }
}
