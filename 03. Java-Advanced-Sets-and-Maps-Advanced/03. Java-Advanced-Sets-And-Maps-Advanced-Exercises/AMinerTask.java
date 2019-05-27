import java.util.LinkedHashMap;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, Integer> resources = new LinkedHashMap<>();

        String input = scan.nextLine();
        while (!input.equals("stop")) {

            String resource = input;
            int quantity = Integer.parseInt(scan.nextLine());


            if (!resources.containsKey(resource)) {
                resources.put(resource, quantity);
            } else {
                resources.put(resource, resources.get(resource) + quantity);
            }
            input = scan.nextLine();
        }

        resources.forEach((key, value) ->
                System.out.printf("%s -> %d\n", key, value));
    }
}