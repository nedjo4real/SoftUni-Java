import java.util.Arrays;
import java.util.Scanner;
//Equal Arrays
public class Equal_Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] firstArr = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int[] secondArr = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int sum = 0;
        for (int i = 0; i < secondArr.length; i++) {
            sum += firstArr[i];
            if (firstArr[i] != secondArr[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            }else if(firstArr[i] == secondArr[i] && i == secondArr.length - 1){
                System.out.println("Arrays are identical. Sum: "+ sum);
            }
        }
    }
}
