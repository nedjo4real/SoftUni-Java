import java.math.BigInteger;
import java.util.Scanner;
//Sum Big Numbers
public class Sum_Big_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger firstNum = new BigInteger(scan.nextLine());
        BigInteger secondNum = new BigInteger(scan.nextLine());

        System.out.println(firstNum.add(secondNum));

    }
}
