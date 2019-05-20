import java.util.Scanner;
//Palindorme Integers
public class Palindrome_Integers {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String input = " ";

            while(!"END".equals(input = scan.nextLine())) {
                boolean isPalindrom = true;
                for (int i = 0; i < input.length() / 2; i++) {
                    if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                        isPalindrom = false;
                    }
                }
                System.out.println(isPalindrom);
            }

    }
}
