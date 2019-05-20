import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer[] commands = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).toArray(Integer[]::new);
        Integer[] numbers = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).toArray(Integer[]::new);
        ArrayDeque<Integer> numbersStack = new ArrayDeque<>();

        int N = commands[0];
        int S = commands[1];
        int X = commands[2];

        for (int i = 0; i < N; i++) {
            numbersStack.push(numbers[i]);
        }

        for (int i = 0; i < S; i++) {
            numbersStack.pop();
        }

        if (numbersStack.isEmpty()) {
            System.out.println(0);
            return;
        }

        int searchNumber = X;
        int smallestNum = Integer.MAX_VALUE;
        while (!numbersStack.isEmpty()) {
            int currentNum = numbersStack.pop();
            if (currentNum == searchNumber) {
                System.out.println("true");
                return;
            }
            if (currentNum < smallestNum) {
                smallestNum = currentNum;
            }
        }
        System.out.println(smallestNum);
    }
}
