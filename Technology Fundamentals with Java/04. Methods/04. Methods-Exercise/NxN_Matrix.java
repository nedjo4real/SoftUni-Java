import java.util.Scanner;
//NxN Matrix
public class NxN_Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(a+ " ");
            }
            System.out.println();
        }

    }
}
