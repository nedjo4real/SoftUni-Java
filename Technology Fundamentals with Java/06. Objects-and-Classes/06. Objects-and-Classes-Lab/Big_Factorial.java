import java.math.BigInteger;
import java.util.Scanner;
//Big Factorial
public class Big_Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        System.out.println(factorial(a));
    }

    public static BigInteger factorial(int num)
    {
        BigInteger factvalue = BigInteger.ONE;

        for(int i=2;i<=num;i++)
        {
            factvalue=factvalue.multiply(BigInteger.valueOf(i));
        }

        return factvalue;
    }
}
