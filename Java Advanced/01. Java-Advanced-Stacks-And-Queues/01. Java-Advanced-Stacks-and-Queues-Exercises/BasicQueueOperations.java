import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer[] commands = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).toArray(Integer[]::new);
        Integer[] numbers = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).toArray(Integer[]::new);
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int N = commands[0];
        int S = commands[1];
        int X = commands[2];


        for (int i = 0; i < N; i++) {
            queue.add(numbers[i]);
        }

        for (int i = 0; i < S; i++) {
            queue.remove();
        }
        if (queue.isEmpty()) {
            System.out.println(0);
        }
        int counter = 0;
        int smallest = Integer.MAX_VALUE;
        for (Integer number : queue) {
            if (number < smallest) {
                smallest = number;
            }
            if (number == X) {
                System.out.println("true");
                counter++;
            }
        }

        if (counter == 0 && !queue.isEmpty()) {
            System.out.println(smallest);
        }
    }
}
