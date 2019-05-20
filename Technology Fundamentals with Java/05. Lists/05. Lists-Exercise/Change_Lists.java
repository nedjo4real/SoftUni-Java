import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
//Change Lists
public class Change_Lists {
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
                case "Delete":
                    int deleteElement = Integer.parseInt(tokens[1]);
                    numbers = numbers.stream().filter(e -> e != deleteElement).collect(Collectors.toList());
                    break;
                case "Insert":
                    int element = Integer.parseInt(tokens[1]);
                    int position = Integer.parseInt(tokens[2]);
                    if(position>=numbers.size()){
                        break;
                    }else {
                        numbers.add(position, element);
                    }
                    break;
            }
            if (line.equals("end")) {
                break;
            } else {
                line = scan.nextLine();
            }
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}

