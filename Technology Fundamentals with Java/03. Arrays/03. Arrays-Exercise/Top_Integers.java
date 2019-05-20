import java.util.Arrays;
import java.util.Scanner;
//Top Integers
public class Top_Integers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split(" ");
        int[] numbers = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            numbers[i] = Integer.parseInt(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            boolean isGreater = true;
            for (int j = i+1; j < arr.length; j++) {
                if(numbers[i] <= numbers[j]){
                    isGreater=false;
                    break;
                }
            }
            if(isGreater){
                System.out.print(numbers[i]+" ");
            }
        }
    }
}
