import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//House Party
public class House_Party {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = Integer.parseInt(scan.nextLine());

        List<String> guests = new ArrayList<>();

        while (x > 0) {

            String line = scan.nextLine();
            String[] tokens = line.split("\\s+");

            if (!line.contains("not")) {
                if (guests.contains(tokens[0])) {
                    System.out.println(tokens[0] + " is already in the list!");
                } else {
                    guests.add(tokens[0]);
                }
            } else {
                if (guests.contains(tokens[0])) {
                    guests.remove(tokens[0]);
                } else {
                    System.out.println(tokens[0] + " is not in the list!");
                }
            }
            x--;
        }
        guests.forEach(e -> System.out.println(e));
    }
}


