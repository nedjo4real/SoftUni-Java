import java.util.Scanner;
//Longer Line
public class Longer_Line {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());

        double x3 = Double.parseDouble(scan.nextLine());
        double y3 = Double.parseDouble(scan.nextLine());
        double x4 = Double.parseDouble(scan.nextLine());
        double y4 = Double.parseDouble(scan.nextLine());

        double firstLine = getLineLenght(x1, y1, x2, y2);
        double secondLine = getLineLenght(x3, y3, x4, y4);

        if (firstLine >= secondLine) {
            if (isCloserToTheCenter(x1, y1) <= isCloserToTheCenter(x2, y2)) {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x1, y1, x2, y2);
            } else {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x2, y2, x1, y1);
            }
        } else {
            if (isCloserToTheCenter(x3, y3) <= isCloserToTheCenter(x4, y4)) {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x3, y3, x4, y4);
            } else {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x4, y4, x3, y3);
            }
        }
    }

    public static double isCloserToTheCenter(double x1, double y1) {
        double res = Math.sqrt(Math.pow(x1 - 0, 2) + Math.pow(y1 - 0, 2));
        return res;
    }

    public static double getLineLenght(double x1, double y1, double x2, double y2) {
        double lenght = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return lenght;
    }

}

