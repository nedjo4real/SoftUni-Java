import java.math.BigDecimal;
import java.util.Scanner;
//Exact Sum of Real Number
public class Exact_Sum_of_Real_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        BigDecimal res = new BigDecimal( "0" );
        for (int i = 0; i < n; i++) {
            BigDecimal num  = new BigDecimal(scan.nextLine());
            res = res.add(num);
        }
        System.out.println(res);
    }
}
