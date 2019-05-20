import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;
//*Mixed Up Lists
public class Mixed_Up_Lists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        List<Integer> firstList = Arrays.stream(scan.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scan.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();

        while (true) {
            if (firstList.size() <= 0 || secondList.size() <= 0) {
                break;
            }

            int element = firstList.get(0);
            firstList.remove(0);
            resultList.add(element);

            int secondElement = secondList.get(secondList.size() - 1);
            secondList.remove(secondList.size() - 1);
            resultList.add(secondElement);

        }

        List<Integer> parameters = new ArrayList<>();

        if (firstList.size() == 2) {
            parameters = firstList;
        } else {
            parameters = secondList;
        }

        int start = 0;
        int end = 0;

        if (parameters.get(0) > parameters.get(1)) {
            start = parameters.get(1);
            end = parameters.get(0);
        } else {
            start = parameters.get(0);
            end = parameters.get(1);
        }

        final int start1 = start;
        final int end1 = end;

        resultList = resultList.stream().filter(x -> x > start1 && x < end1).collect(Collectors.toList());
        Collections.sort(resultList);

        System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));

    }

}
