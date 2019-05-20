import java.util.Arrays;
import java.util.Scanner;
//*Odd Times
public class Odd_Times {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            result ^= numbers[i];
        }

        System.out.println(result);
    }
}
