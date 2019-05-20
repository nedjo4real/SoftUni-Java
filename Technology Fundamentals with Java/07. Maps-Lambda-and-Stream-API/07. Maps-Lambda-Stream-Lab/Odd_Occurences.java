import java.util.*;
import java.util.Scanner;
//Odd Occurences
public class Odd_Occurences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] words = scan.nextLine().toLowerCase().split("\\s+");
        LinkedHashMap<String, Integer> pairs = new LinkedHashMap<>();

        for (String word : words) {

            if (!pairs.containsKey(word)) {

                pairs.put(word, 1);
            } else {
                pairs.put(word, pairs.get(word) + 1);
            }
        }

        List<String> resultList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : pairs.entrySet()) {

            if (entry.getValue() % 2 != 0){

                resultList.add(entry.getKey());
            }
        }

        System.out.println(resultList.toString().replaceAll("[\\[\\]]",""));
    }
}
