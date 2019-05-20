import java.util.Scanner;
//Data Type Finder
public class Data_Type_Finder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        while (!input.equals("END")) {
            try {
                Integer.parseInt(input);
                System.out.printf("%s is integer type%n", input);
                input = scan.nextLine();
                continue;
            } catch (Exception ignored) {
            }
            try {
                Float.parseFloat(input);
                System.out.printf("%s is floating point type%n", input);
                input = scan.nextLine();
                continue;
            } catch (Exception ignored) {
            }
            try {
                if (input.length() > 1 && !input.toLowerCase().equals("true") && !input.toLowerCase().equals("false")) {
                    System.out.printf("%s is string type%n", input);
                    input = scan.nextLine();
                    continue;
                }
            } catch (Exception ignored) {
            }
            try {
                if (input.length() == 1) {
                    input.charAt(0);
                    System.out.printf("%s is character type%n", input);
                    input = scan.nextLine();
                    continue;
                }
            } catch (Exception ignored) {
            }
            try {
                if (input.toLowerCase().equals("true") || input.toLowerCase().equals("false")) {
                    System.out.printf("%s is boolean type%n", input);
                    input = scan.nextLine();
                }
            } catch (Exception ignored) {
            }
        }
    }
}