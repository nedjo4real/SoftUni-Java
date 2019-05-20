import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
//List Manipulation Andvanced
public class List_Manipulation_Advanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers =
                Arrays.stream(scan.nextLine()
                        .split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String line = scan.nextLine();

        while (!line.equals("end")) {

            String[] tokens = line.split("\\s+");

            switch (tokens[0]) {
                case "Contains":
                    if (contains(tokens, numbers) == false) {
                        System.out.println("No such number");
                        break;
                    } else if (contains(tokens, numbers) == true) {
                        System.out.println("Yes");
                        break;
                    }

                case "Print":
                    if ("even".equals(tokens[1])) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 == 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                    } else if ("odd".equals(tokens[1])) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 != 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;

                case "Get":
                    if (tokens[1].equals("sum")) {
                        int sum = 0;
                        int num = 0;
                        for (int i = 0; i < numbers.size(); i++) {
                            num = numbers.get(i);
                            sum += num;
                        }
                        System.out.println(sum);
                    }
                    break;
                case "Filter":
                    int numb = Integer.parseInt(tokens[2]);

                    List<Integer> nums = new ArrayList<>();

                    if (tokens[1].equals("<")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numb > numbers.get(i)) {
                                nums.add(numbers.get(i));
                            }
                        }
                    } else if (tokens[1].equals(">")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numb < numbers.get(i)) {
                                nums.add(numbers.get(i));
                            }
                        }
                    } else if (tokens[1].equals(">=")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numb <= numbers.get(i)) {
                                nums.add(numbers.get(i));
                            }
                        }
                    } else if (tokens[1].equals("<=")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numb >= numbers.get(i)) {
                                nums.add(numbers.get(i));
                            }
                        }
                    }
                    System.out.println(nums.toString().replaceAll("[\\[\\],]", ""));
                    break;
            }

            if (line.equals("end")) {
                break;
            } else {
                line = scan.nextLine();
            }
        }


    }

    public static boolean contains(String[] tokens, List<Integer> numbers) {

        int number = Integer.parseInt(tokens[1]);

        for (int i = 0; i < numbers.size(); i++) {
            if (number == (numbers.get(i))) {
                return true;
            }

        }
        return false;
    }


}
