import java.util.Scanner;
//Pounds to Dollars
public class Pounds_to_Dollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pound = Double.parseDouble(scan.nextLine());
        double dollar = pound*1.31;
        System.out.printf("%.3f", dollar);
    }
}
