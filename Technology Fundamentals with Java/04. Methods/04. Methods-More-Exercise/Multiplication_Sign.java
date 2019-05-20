import java.util.Scanner;
//Multiplication Sign
public class Multiplication_Sign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());

        plusorminus(a, b, c);
    }

    private static void plusorminus(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0) {
            System.out.println("positive");
        }  else if (a < 0 && b < 0 && c > 0) {
            System.out.println("positive");
        } else if (a < 0 && b > 0 && c < 0) {
            System.out.println("positive");
        } else if (a > 0 && b < 0 && c < 0) {
            System.out.println("positive");
        } else if (a == 0 || b == 0 || c == 0){
            System.out.println("zero");
        } else {
            System.out.println("negative");
        }
    }
}
