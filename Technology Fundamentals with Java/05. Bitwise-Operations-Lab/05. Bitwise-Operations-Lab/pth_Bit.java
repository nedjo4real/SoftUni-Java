import java.util.Scanner;
//p-th Bit
public class pth_Bit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());
        int pos = Integer.parseInt(scan.nextLine());

        input = input >> pos;

        System.out.println(input & 1);
    }
}
