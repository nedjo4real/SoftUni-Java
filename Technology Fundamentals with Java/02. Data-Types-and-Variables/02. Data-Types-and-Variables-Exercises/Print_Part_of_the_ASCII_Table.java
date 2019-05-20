import java.util.Scanner;
//Print Part of the ASCII Table
public class Print_Part_of_the_ASCII_Table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());

        for (int i = n; i <= m; i++) {
            char a = (char) i;
            System.out.print(a);
            System.out.print(" ");
        }
    }
}
