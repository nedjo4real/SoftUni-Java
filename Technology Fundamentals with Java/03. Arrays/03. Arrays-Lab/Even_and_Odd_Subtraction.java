import java.util.Arrays;
import java.util.Scanner;
//Even and Odd Subtraction
public class Even_and_Odd_Subtraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0 ){
                sumEven += numbers[i];
            }else{
                sumOdd += numbers[i];
            }
        }
        System.out.println(sumEven-sumOdd);
    }
}
