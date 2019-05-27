import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsofElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        LinkedHashSet<Integer> firstNumbers = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondNumbers = new LinkedHashSet<>();

        while (n-- > 0) {
            int number = scan.nextInt();
            firstNumbers.add(number);
        }
        while (m-- > 0) {
            int number = scan.nextInt();
            secondNumbers.add(number);
        }

        firstNumbers.retainAll(secondNumbers);

        firstNumbers.forEach(number -> System.out.print(number + " "));
    }
}
