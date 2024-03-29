import java.util.LinkedHashMap;
import java.util.Scanner;
//Count Chars in a String
public class Count_Chars_in_a_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split("\\s+");
        LinkedHashMap<Character, Integer> pairs = new LinkedHashMap<>();

        for (String word : words) {

            for (char symbol : word.toCharArray()) {
                if (!pairs.containsKey(symbol)) {

                    pairs.put(symbol, 0);
                }
                pairs.put(symbol, pairs.get(symbol) + 1);
            }
        }

        pairs.entrySet().stream().forEach(x -> System.out.println(x.getKey() + " -> " + x.getValue()));

    }
}
