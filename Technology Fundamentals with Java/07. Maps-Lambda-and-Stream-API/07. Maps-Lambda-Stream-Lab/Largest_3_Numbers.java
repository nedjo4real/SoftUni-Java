import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;
//Largest 3 Numbers
public class Largest_3_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String result = Arrays.stream(scan.nextLine()
                .split("\\s+"))
                .map(n -> Integer.parseInt(n))
                .sorted(Collections.reverseOrder())
                .limit(3)
                .map(n -> String.valueOf(n))
                .collect(Collectors.joining(" "));
        System.out.println(result);

    }
}
