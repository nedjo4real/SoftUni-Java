import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();

        String input = scan.nextLine();

        Arrays.stream(input.split("\\s+"))
                .forEach(stack::add);

        int sum = 0;
        while (!stack.isEmpty()) {
            if (stack.peek().equals("+")) {
                stack.pop();
                int a = Integer.parseInt(stack.pop());
                sum += a;
            } else if (stack.peek().equals("-")) {
                stack.pop();
                int a = Integer.parseInt(stack.pop());
                sum -= a;
            } else {
                int a = Integer.parseInt(stack.pop());
                sum += a;
            }
        }
        System.out.println(sum);
    }
}