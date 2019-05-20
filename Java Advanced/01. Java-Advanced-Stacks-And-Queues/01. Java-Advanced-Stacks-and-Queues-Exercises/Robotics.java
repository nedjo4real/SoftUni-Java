import java.util.ArrayDeque;
import java.util.Scanner;

public class Robotics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] robotsNameAndTime = scanner.nextLine().split(";");
        String[] robotName = new String[robotsNameAndTime.length];
        int[] robotTime = new int[robotsNameAndTime.length];
        int[] processTime = new int[robotsNameAndTime.length];

        for (int i = 0; i < robotsNameAndTime.length; i++) {
            robotName[i] = robotsNameAndTime[i].split("-")[0];
            robotTime[i] = Integer.parseInt(robotsNameAndTime[i].split("-")[1]);
        }
        String[] startTime = scanner.nextLine().split(":");
        int hours = Integer.parseInt(startTime[0]);
        int minutes = Integer.parseInt(startTime[1]);
        int seconds = Integer.parseInt(startTime[2]);

        int totalTime = hours * 3600 + minutes * 60 + seconds;
        int countTime = 0;

        ArrayDeque<String> inputProducts = new ArrayDeque<>();
        String currentProduct = scanner.nextLine();
        while (!currentProduct.equals("End")) {
            inputProducts.offer(currentProduct);
            currentProduct = scanner.nextLine();
        }

        while (!inputProducts.isEmpty()) {
            countTime++;
            String productOnLine = inputProducts.poll();
            boolean isBusy = false;
            for (int i = 0; i < robotsNameAndTime.length; i++) {
                if (processTime[i] == 0 && !isBusy) {
                    processTime[i] = robotTime[i];
                    System.out.println(String.format("%s - %s [%02d:%02d:%02d]", robotName[i], productOnLine, ((totalTime + countTime) / 3600) % 24,
                            ((totalTime + countTime) % 3600) / 60, ((totalTime + countTime) % 60)));
                    isBusy = true;
                }
                if (processTime[i] > 0) {
                    processTime[i]--;
                }
            }
            if (!isBusy) {
                inputProducts.offer(productOnLine);
            }
        }
    }
}