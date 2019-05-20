import java.util.Scanner;
//Add and Subtract
public class Add_and_Subtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());

        System.out.println((a+b)-c);
    }
}
