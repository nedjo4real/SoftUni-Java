import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = "";

        LinkedHashMap<String, String> contacts = new LinkedHashMap<>();

        while (!"search".equals(input = scan.nextLine())) {
            String[] nameNumber = input.split("-");
            String name = nameNumber[0];
            String number = nameNumber[1];

            contacts.putIfAbsent(name, number);
        }

        while (!"stop".equals(input = scan.nextLine())) {
            if (contacts.containsKey(input)) {
                System.out.println(String.format("%s -> %s", input, contacts.get(input)));
            } else {
                System.out.println("Contact " + input + " does not exist.");
            }
        }
    }
}