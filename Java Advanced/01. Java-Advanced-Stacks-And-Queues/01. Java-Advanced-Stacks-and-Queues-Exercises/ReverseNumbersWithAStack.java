import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] numbers = scan.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (String number : numbers) {
            stack.push(number);
        }
        for (String num : stack) {
            System.out.print(stack.pop() + " ");
        }

    }
}