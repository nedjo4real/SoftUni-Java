import java.util.Scanner;
//Train
public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] numbers = new int[n];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(scan.nextLine());
            sum+=numbers[i];
        }

        for(int number : numbers){
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
