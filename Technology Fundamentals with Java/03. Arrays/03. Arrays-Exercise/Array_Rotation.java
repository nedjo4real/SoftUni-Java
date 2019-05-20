import java.util.Arrays;
import java.util.Scanner;
//Array Rotation
public class Array_Rotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (numbers.length); j++) {
                    int temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;

            }
        }
        for(int num : numbers){
            System.out.print(num+" ");
        }

    }
}
