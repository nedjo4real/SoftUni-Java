import java.util.Arrays;
import java.util.Scanner;
//Magic Sum
public class Magic_Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numbers.length; i++) {
            int sum = n;
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[i]+numbers[j] == sum){
                    System.out.print(numbers[i] + " " + numbers[j]  + " " );
                    System.out.println();
                }
            }
        }
    }
}
