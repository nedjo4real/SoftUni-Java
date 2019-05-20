import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//String Explosion
public class String_Explosion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] symbols = scan.nextLine().toCharArray();
        List<Character> chars = new ArrayList<>();

        for (Character aChar : symbols) {

            chars.add(aChar);
        }

        int length = 0;

        for (int i = 0; i < chars.size(); i++) {
            if (chars.get(i) == '>') {
                length += Integer.parseInt(chars.get(i + 1) + "");
            } else {
                if (length > 0) {
                    chars.remove(i);
                    i--;
                    length--;
                }
            }
        }
        System.out.println(chars.toString().replaceAll("[\\[\\], ]",""));

    }
}
