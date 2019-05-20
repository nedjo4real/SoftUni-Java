import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();

        String input = "";

        while (!"print".equals(input = scan.nextLine())) {
            if (!"cancel".equals(input)) {
                queue.offer(input);
            } else {
                if (!queue.isEmpty()) {
                    System.out.println("Canceled " + queue.poll());
                } else {
                    System.out.println("Printer is on standby");
                }
            }
        }
        for (String q : queue) {
            System.out.println(q);
        }
    }
}
