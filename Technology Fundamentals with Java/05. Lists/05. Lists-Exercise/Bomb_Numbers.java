import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
//Bomb Numbers
public class Bomb_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> elements =
                Arrays.stream(scan.nextLine()
                        .split("\\s+"))
                        .collect(Collectors.toList());

        String data = scan.nextLine();
        String bombNumber = data.substring(0,1);

        int power = Integer.parseInt(data.substring(data.indexOf(' ') + 1));

        while(elements.contains(bombNumber)){
            int elementIndex = elements.indexOf(bombNumber);

            int left = Math.max(0, elementIndex - power);
            int right = Math.min(elementIndex + power, elements.size() - 1);

            for (int i = right; i >= left; i--) {
                elements.remove(i);
            }
        }
        System.out.println(elements.stream()
                .mapToInt(Integer::parseInt).sum());

    }
}
