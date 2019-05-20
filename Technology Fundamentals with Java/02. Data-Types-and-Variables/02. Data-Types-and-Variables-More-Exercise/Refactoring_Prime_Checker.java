import java.util.Scanner;
//Refactoring: Prime Checker
public class Refactoring_Prime_Checker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        for (int takoa = 2; takoa <= n; takoa++) {
            boolean takovalie = true;
            for (int cepitel = 2; cepitel < takoa; cepitel++) {
                if (takoa % cepitel == 0) {
                    takovalie = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", takoa, takovalie);
        }
    }
}
