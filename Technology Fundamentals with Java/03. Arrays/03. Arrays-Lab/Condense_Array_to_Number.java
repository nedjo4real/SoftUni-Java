import java.util.Arrays;
import java.util.Scanner;
//Condense Array to Number
public class Condense_Array_to_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int[] consedense = new int[numbers.length-1];

        if(numbers.length == 1){
            System.out.println(numbers[0]);
            return;
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                consedense[j] = numbers[j] + numbers[j + 1];
            }
            numbers = consedense;
        }
        System.out.println(numbers[0]);
    }
}
