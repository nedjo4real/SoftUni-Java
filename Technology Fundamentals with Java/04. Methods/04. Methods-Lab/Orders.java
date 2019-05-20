import java.text.DecimalFormat;
import java.util.Scanner;
//Orders
public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        int kolko = Integer.parseInt(scan.nextLine());

        double price = 0;

        switch (product){
            case "water":
                price = 1;
                res(price, kolko);
                break;
            case "coke":
                price = 1.40;
                res(price, kolko);
                break;
            case "coffee":
                price = 1.50;
                res(price, kolko);
                break;
            case "snacks":
                price = 2;
                res(price, kolko);
                break;
        }

    }
    public static void res(double price, int kolko){
        DecimalFormat df = new DecimalFormat("#.##");
        df.setMinimumFractionDigits(2);
        double result = price*kolko;
        System.out.println(df.format(result));
    }
}
