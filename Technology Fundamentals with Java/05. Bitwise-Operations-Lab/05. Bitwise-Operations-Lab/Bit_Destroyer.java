import java.util.Scanner;
//Bit Destroyer
public class Bit_Destroyer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int p = Integer.parseInt(scan.nextLine());

        int mask = 1<<p;

        mask = ~mask;

        System.out.println(n & mask);
    }
}
