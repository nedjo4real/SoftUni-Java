import java.util.Scanner;
//Floating Equality
public class Floating_Equality {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double firstFl = Double.parseDouble(scan.nextLine());
        double secondFl = Double.parseDouble(scan.nextLine());
        double epsilon = 0.000001;
        if (firstFl < secondFl) {
            double temp = firstFl;
            firstFl = secondFl;
            secondFl = temp;
        }
        if (firstFl - secondFl < epsilon) {
            System.out.println("True");
        } else  {
            System.out.println("False");
        }
    }
}
