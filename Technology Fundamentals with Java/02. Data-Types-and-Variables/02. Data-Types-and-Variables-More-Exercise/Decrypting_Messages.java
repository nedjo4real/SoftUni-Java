import java.util.Scanner;
//Decrypting Messages
public class Decrypting_Messages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int key = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());

        String output = "";
        for (int i = 0; i < n; i++) {
            char x = scan.next().charAt(0);
            int x1 = (int) x;
            x1+=key;
            char x2 = (char) x1;
            output = output + "" + x2;
        }
        System.out.println(output);
    }
}