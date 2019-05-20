import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//*Star Enigma
public class Star_Enigma {
    private static final String REGEX_LETTERS = "[star]";
    private static final String REGEX_MSG = "@(?<planet>[A-Za-z]+)[^@\\-!:>]*:(?<population>[0-9]+)[^@\\-!:>]*!(?<attack>(A|D))![^@\\-!:>]*->(?<soldierCount>[0-9]+)";
    private static Pattern letterPattern = Pattern.compile(REGEX_LETTERS);
    private static Pattern msgPattern = Pattern.compile(REGEX_MSG);

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer lines = Integer.valueOf(reader.readLine());
        TreeSet<String> attacked = new TreeSet<>();
        TreeSet<String> destroyed = new TreeSet<>();

        for (int i = 0; i < lines; i++) {
            String input = reader.readLine();
            Matcher letterMatcher = letterPattern.matcher(input.toLowerCase());
            Integer key = 0;
            while (letterMatcher.find()) {
                key++;
            }

            String message = mapInput(input, key);
            Matcher msgMatcher = msgPattern.matcher(message);

            if (msgMatcher.find()) {
                String planetName = msgMatcher.group("planet");
                String attackType = msgMatcher.group("attack");

                switch (attackType) {
                    case "A":
                        attacked.add(planetName);
                        break;
                    case "D":
                        destroyed.add(planetName);
                        break;
                }
            }
        }

        System.out.println(String.format("Attacked planets: %d", attacked.size()));
        attacked.forEach(p -> System.out.println(String.format("-> %s", p)));
        System.out.println(String.format("Destroyed planets: %d", destroyed.size()));
        destroyed.forEach(p -> System.out.println(String.format("-> %s", p)));
    }

    private static String mapInput(String input, Integer key) {
        StringBuilder word = new StringBuilder();
        char[] letters = input.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            word.append(String.format("%s", (char) (letters[i] - key)));

        }
        return word.toString();
    }
}

