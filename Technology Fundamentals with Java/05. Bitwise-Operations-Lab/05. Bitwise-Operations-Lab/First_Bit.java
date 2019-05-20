import java.util.Scanner;
//First Bit
public class First_Bit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());

        input = input >> 1;
        System.out.println(input & 1);
    }
}
