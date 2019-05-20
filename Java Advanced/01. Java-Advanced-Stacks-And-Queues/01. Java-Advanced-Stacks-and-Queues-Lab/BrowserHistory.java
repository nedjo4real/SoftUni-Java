import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();

        String input = "";

        while (!"Home".equals(input = scan.nextLine())) {

            if (input.equals("back")) {
                if (stack.size() < 2) {
                    System.out.println("no previous URLs");
                } else {
                    stack.pop();
                    System.out.println(stack.peek());
                }
            } else {
                stack.push(input);
                System.out.println(stack.peek());
            }

        }
    }
}