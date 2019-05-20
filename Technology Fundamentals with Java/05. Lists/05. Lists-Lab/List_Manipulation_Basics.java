import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
//List Manipulation Basics
public class List_Manipulation_Basics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers =
                Arrays.stream(scan.nextLine()
                        .split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String line = scan.nextLine();

        while(!line.equals("end")){



            String[] tokens = line.split("\\s+");

            switch(tokens[0]){
                case "Add":
                    int numberToAdd = Integer.parseInt(tokens[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(tokens[1]);
                    for (int i = 0; i < numbers.size(); i++) {
                        if(numberToRemove== numbers.get(i)){
                            numbers.remove(i);
                        }
                    }
                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(tokens[1]);
                    numbers.remove(indexToRemove);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(tokens[1]);
                    int indexToInsert = Integer.parseInt(tokens[2]);
                    numbers.add(indexToInsert,numberToInsert);
                    break;
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
