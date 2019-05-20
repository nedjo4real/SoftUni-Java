import java.util.Scanner;
//*Tri bit Switch
public class Tri_bit_Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());
        int pos = Integer.parseInt(scan.nextLine());

        int mask = 7;

        mask = mask<<pos;

        System.out.println(input ^ mask);
    }
}
