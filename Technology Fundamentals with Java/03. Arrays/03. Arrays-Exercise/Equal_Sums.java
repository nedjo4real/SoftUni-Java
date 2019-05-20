import java.util.Arrays;
import java.util.Scanner;
//Equal Sums
public class Equal_Sums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] number = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        if(number.length == 1){
            System.out.println(0);
            return;
        }

        int sum1 = 0;
        for (int i = 0; i < number.length ; i++) {
                if(i > 0){
                    sum1 += number[i-1];
                }

            int sum2 = 0;
            for (int j = i+1; j < number.length; j++) {
                sum2 += number[j];
            }
            if(sum1 == sum2) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("no");
    }
}
