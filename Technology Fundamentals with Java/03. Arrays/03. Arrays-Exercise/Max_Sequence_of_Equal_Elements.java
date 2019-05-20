import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
//Max Sequence of Equal Elements
public class Max_Sequence_of_Equal_Elements {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxCount = 0;
        int maxIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            int currentCount = 0;
            for (int j = i; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]){
                    currentCount++;
                    if (currentCount > maxCount) {
                        maxCount = currentCount;
                        maxIndex = i;
                    }
                }else {
                    break;
                }
            }
        }
        for (int i = 0; i < maxCount; i++) {
            System.out.print(numbers[i + maxIndex] + " ");
        }
    }
}
