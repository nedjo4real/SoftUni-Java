import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match_Dates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String datesString = scanner.nextLine();
        String regex = "\\b(?<day>\\d{2})([-.\\/])(?<month>[A-z][a-z]{2})\\2(?<year>[\\d]{4})\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(datesString);

        while (matcher.find()) {
            String day = matcher.group("day");
            String month = matcher.group("month");
            String year = matcher.group("year");

            System.out.printf("Day: %s, Month: %s, Year: %s%n", day, month, year);
        }
    }
}
