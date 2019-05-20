import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
//*Drum Set
public class Drum_Set {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double cash = Double.parseDouble(scan.nextLine());
        List<Integer> drums = Arrays.stream(scan.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> originals = new ArrayList<>();

        originals.addAll(drums);

        while (true) {
            String command = scan.nextLine();

            if (command.equals("Hit it again, Gabsy!")) {
                break;
            }

            int hitPower = Integer.parseInt(command);

            for (int i = 0; i < drums.size(); i++) {
                int original = originals.get(i);

                drums.set(i, drums.get(i) - hitPower);

                if (drums.get(i) <= 0) {
                    double price = original * 3;

                    if (cash >= price) {
                        drums.set(i, original);
                        cash -= price;
                    }
                }
            }
        }

        drums = drums.stream().filter(x -> x > 0).collect(Collectors.toList());
        System.out.println(drums.toString().replaceAll("[\\[\\],]", ""));
        System.out.printf("Gabsy has %.2flv.", cash);
    }
}
