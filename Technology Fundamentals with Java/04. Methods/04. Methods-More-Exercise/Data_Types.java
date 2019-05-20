import java.text.DecimalFormat;
import java.util.Scanner;
//Data Types
public class Data_Types {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#.##");
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);

        String type = scan.nextLine();
        String value = scan.nextLine();

        String temp = "";
        if (type.equals("int")) {
            int a = Integer.parseInt(value);
            a = a * 2;
            temp = Integer.toString(a);
            System.out.println(temp);
        } else if (type.equals("real")) {
            double a = Double.parseDouble(value);
            a = a * 1.5;
            System.out.println(df.format(a));
        } else if (type.equals("string")) {
            temp = "$" + value + "$";
            System.out.println(temp);
        }
    }
}
