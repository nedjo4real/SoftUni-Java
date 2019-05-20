import java.text.DecimalFormat;
import java.util.Scanner;
//Town Info
public class Town_Info {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String town = scan.nextLine();
        long people = Long.parseLong(scan.nextLine());
        double weight = Double.parseDouble(scan.nextLine());

        DecimalFormat df = new DecimalFormat("#");

        System.out.println("Town "+town+" has population of "+people+" and area "+df.format(weight)+" square km.");
    }
}
