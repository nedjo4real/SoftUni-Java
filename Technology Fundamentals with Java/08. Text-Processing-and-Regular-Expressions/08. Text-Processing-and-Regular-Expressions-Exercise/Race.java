import java.util.Scanner;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
//Race
public class Race {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> players = new LinkedHashMap<>();
        String[] input = scan.nextLine().split(", ");

        for (int i = 0; i < input.length; i++) {
            players.putIfAbsent(input[i], 0);
        }

        String line = scan.nextLine();

        while (!line.equals("end of race")) {
            String name = "";
            int result = 0;

            Pattern pattern = Pattern.compile("[A-Za-z]+");
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                name += matcher.group();
            }

            Pattern patternDigit = Pattern.compile("\\d");
            Matcher matcherDigit = patternDigit.matcher(line);
            while (matcherDigit.find()) {
                result += Integer.parseInt(matcherDigit.group());
            }

            if (players.containsKey(name)) {
                players.put(name, players.get(name) + result);
            }

            line = scan.nextLine();
        }
        List<String> names = new LinkedList<>();
        players.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(3).forEach(p -> names.add(p.getKey()));

        System.out.printf("1st place: %s\n" +
                "2nd place: %s\n" +
                "3rd place: %s\n", names.get(0), names.get(1), names.get(2));
    }

}
