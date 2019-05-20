import java.util.Arrays;
import java.util.Scanner;
//Word Filter
public class Word_Filter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Arrays.stream(scan.nextLine()
                .split("\\s+"))
                .filter(w -> w.length() % 2 == 0)
                .forEach(e -> System.out.println(e));
    }
}
