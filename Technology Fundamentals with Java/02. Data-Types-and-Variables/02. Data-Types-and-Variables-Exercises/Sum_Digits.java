import java.util.Scanner;
//Sum Digits
public class Sum_Digits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        int temp = 0;
        int sumDigits = 0;

        while (num!=0) {
            temp = num%10;
            sumDigits += temp;
            num/=10;
        }

        System.out.println(sumDigits);
    }
}
