import java.util.Scanner;
//Print Numbers in Reverse Order
public class Print_Numbers_in_Reverse_Order {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int[] numbers = new int[n];

        for (int i = 0; i <numbers.length; i++) {
            int number = Integer.parseInt(scan.nextLine());
            numbers[i]=number;
        }
        for (int i = numbers.length - 1 ; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
