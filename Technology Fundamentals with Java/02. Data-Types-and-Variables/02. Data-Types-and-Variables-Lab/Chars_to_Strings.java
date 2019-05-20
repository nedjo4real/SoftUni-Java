import java.util.Scanner;
//Chars to Strings
public class Chars_to_Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char c1 = scan.next().charAt(0);
        char c2 = scan.next().charAt(0);
        char c3 = scan.next().charAt(0);
        String s = "" + c1 + c2 + c3;
        System.out.println(s);
    }
}
