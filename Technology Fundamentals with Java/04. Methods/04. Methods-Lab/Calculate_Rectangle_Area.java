import java.util.Scanner;
// Calculate Rectangle Area
public class Calculate_Rectangle_Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        double result = getRectangleArea(a, b);
        System.out.printf("%.0f",result);
    }
    public static double getRectangleArea(double a, double b){
        double res = a*b;
        return res;
    }
}
