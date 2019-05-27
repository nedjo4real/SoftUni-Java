import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        TreeSet<String> elements = new TreeSet<>();

        while (n-- > 0) {
            String[] inputElements = scan.nextLine().split("\\s+");

            elements.addAll(Arrays.asList(inputElements));
        }

        for (String element : elements) {
            System.out.print(element + " ");
        }
    }
}
