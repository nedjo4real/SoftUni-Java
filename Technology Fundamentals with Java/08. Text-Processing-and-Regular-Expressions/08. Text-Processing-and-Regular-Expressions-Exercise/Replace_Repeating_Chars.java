import java.util.Scanner;
//Replace Repeating Chars
public class Replace_Repeating_Chars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            if (i == 0) {
                sb.append(line.charAt(i));
                continue;
            }

            if (sb.toString().charAt(sb.length() - 1) != line.charAt(i)) {
                sb.append(line.charAt(i));
            }
        }

        System.out.println(sb);

    }
}
