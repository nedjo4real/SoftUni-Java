import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
//*Pokemon Don't Go
public class Pokemon_Dont_Go {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;

        while (!numbers.isEmpty()) {

            int index = Integer.parseInt(scan.nextLine());

            if (index >= 0 && index < numbers.size()) {

                int element = numbers.get(index);
                sum += element;
                numbers.remove(index);

                changeListElements(numbers, element);
            } else if (index < 0) {

                int element = numbers.get(0);
                sum += element;
                numbers.set(0, numbers.get(numbers.size() - 1));
            } else {

                int element = numbers.get(numbers.size() - 1);
                sum += element;
                numbers.set(numbers.size() - 1, numbers.get(0));
            }
        }

        System.out.println(sum);
    }

    private static void changeListElements(List<Integer> numbers, int element) {

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) <= element) {

                numbers.set(i, numbers.get(i) + element);
            } else {
                numbers.set(i, numbers.get(i) - element);
            }
        }
    }
}