import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbersString = scanner.nextLine();
        String regex = "(^|(?<=\\s))-?\\d+(\\.\\d+)?($|(?=\\s))";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(numbersString);

        List<String> matches = new ArrayList<>();

        while (matcher.find()) {
            matches.add(matcher.group());
        }

        System.out.println(String.join(" ", matches));
    }
}
