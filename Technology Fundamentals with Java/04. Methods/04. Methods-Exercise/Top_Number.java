import java.util.Scanner;
//Top Number
public class Top_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= number; i++) {
            if (oneOdd(i) && isDivisible(i)) {
                System.out.println(i);
            }
        }
    }


    private static boolean oneOdd(int number) {
        String num = String.valueOf(number);

        boolean flag = false;
        for (int i = 0; i < num.length(); i++) {
            if (Integer.parseInt(String.valueOf(num.charAt(i) % 2)) != 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean isDivisible(int number) {

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        if (sum % 8 == 0) {
            return true;
        }
        return false;
    }
}
