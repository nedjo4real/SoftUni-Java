import java.text.DecimalFormat;
import java.util.Scanner;
//Center Point
public class Center_Point {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());

        DecimalFormat df = new DecimalFormat("0.########");

        double first = Math.sqrt(Math.pow(y1, 2) + Math.pow(x1, 2));
        double second = Math.sqrt(Math.pow(y2, 2) + Math.pow(x2, 2));
        if(first<second){
            System.out.print("(");
            System.out.print(df.format(x1)+", ");
            System.out.print(df.format(y1)+")");
        }else {
            System.out.print("(");
            System.out.print(df.format(x2)+", ");
            System.out.print(df.format(y2)+")");
        }
    }
}
