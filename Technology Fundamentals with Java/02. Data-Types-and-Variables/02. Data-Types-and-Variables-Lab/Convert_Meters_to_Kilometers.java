import java.util.Scanner;
//Convert Meters to Kilometers
public class Convert_Meters_to_Kilometers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double meters = Double.parseDouble(scan.nextLine());
        double km = meters/1000;
        System.out.printf("%.2f", km);
    }
}
