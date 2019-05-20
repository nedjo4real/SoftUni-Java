import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberDecimal = Integer.parseInt(scan.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        if (numberDecimal == 0) {
            System.out.println(0);
        }

        while (numberDecimal > 0) {
            stack.push(numberDecimal % 2);
            numberDecimal /= 2;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

    }
}
