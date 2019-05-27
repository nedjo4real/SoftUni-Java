import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        LinkedHashMap<String, String> emails = new LinkedHashMap<>();

        while (!name.equalsIgnoreCase("stop")) {
            String email = scan.nextLine();
            if (!email.endsWith("us") && !email.endsWith("uk") && !email.endsWith("com")) {
                emails.putIfAbsent(name, email);
            }
            name = scan.nextLine();
        }

        for (Map.Entry<String, String> entry : emails.entrySet()) {
            System.out.println(String.format("%s -> %s", entry.getKey(), entry.getValue()));
        }
    }
}