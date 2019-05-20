import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
//Train
public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers =
                Arrays.stream(scan.nextLine()
                        .split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scan.nextLine());

        String line = scan.nextLine();

        while(!line.equals("end")){



            String[] tokens = line.split("\\s+");

            if(tokens[0].equals("Add")){
                int numberToAdd = Integer.parseInt(tokens[1]);
                numbers.add(numberToAdd);
            }else {
                int number = Integer.parseInt(tokens[0]);
                for (int i = 0; i < numbers.size(); i++) {
                    int num = numbers.get(i)+number;
                    if(num<=maxCapacity){
                        numbers.set(i, num);
                        break;
                    }
                }

            }

            if(line.equals("end")){
                break;
            }else{
                line = scan.nextLine();
            }
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));

    }
}
