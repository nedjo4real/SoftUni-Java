import java.util.Scanner;
//Password Validator
public class Password_Validator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password = scan.nextLine();

        if (!isInRange(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isLetterOrDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!haveAtLeast2Digit(password)) {
            System.out.println("Password must have at least 2 digits");
        }

        if (haveAtLeast2Digit(password) && isLetterOrDigits(password) && isInRange(password)) {
            System.out.println("Password is valid");
        }
    }

    private static boolean isInRange(String password) {

        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        }
        return false;
    }

    private static boolean isLetterOrDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    private static boolean haveAtLeast2Digit(String password) {
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                counter++;
            }
        }
        if(counter < 2){
            return false;
        }
        return true;
    }

}
