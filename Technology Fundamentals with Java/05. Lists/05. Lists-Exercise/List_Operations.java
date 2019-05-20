import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
//List Operations
public class List_Operations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        List<Integer> numbers =
                Arrays.stream(scan.nextLine()
                        .split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String line = scan.nextLine();

        while (line != "End") {
            String[] order = line.split(" ");
            switch (order[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(order[1]));
                    break;

                case "Remove":
                    int ac = Integer.parseInt(order[1]);
                    if (ac < 0 || ac >= numbers.size()) {
                        System.out.println("Invalid index");
                    } else {
                        numbers.remove(ac);
                    }
                    break;

                case "Insert":
                    int ab = Integer.parseInt(order[2]);
                    if (ab >= 0 && ab < numbers.size()) {
                        numbers.add(ab, Integer.parseInt(order[1]));
                    } else {
                        System.out.println("Invalid index");
                    }

                    break;
                case "Shift":
                    if (numbers.size() > 0) {

                        int count = Integer.parseInt(order[2]);
                        if (order[1].equals("left")) {
                            for (int i = 0; i < count % numbers.size(); i++) {
                                numbers.add(numbers.get(0));
                                numbers.remove(0);
                            }
                        } else {
                            for (int i = 0; i < count % numbers.size(); i++) {
                                numbers.add(0, numbers.get(numbers.size() - 1));
                                numbers.remove(numbers.size() - 1);
                            }
                        }
                        break;
                    }
            }
            line = scan.nextLine();
            if (line.equals("End")) {
                break;
            }

        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
