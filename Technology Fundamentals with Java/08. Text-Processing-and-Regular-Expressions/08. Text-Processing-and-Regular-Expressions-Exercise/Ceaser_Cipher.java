import java.util.Scanner;
//Ceaser Cipher
public class Ceaser_Cipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char current = (char) (line.charAt(i) + 3);
            sb.append(current);
        }

        System.out.println(sb);

    }
}
