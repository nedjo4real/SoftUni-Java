import java.util.Scanner;
//Integer Operations
public class Integer_Operations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        double c = Double.parseDouble(scan.nextLine());
        double d = Double.parseDouble(scan.nextLine());
        double res = a+b;
        res /= c;
        res *= d;
        System.out.printf("%.0f",res);
    }
}
