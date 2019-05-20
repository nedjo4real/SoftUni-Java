import java.util.Scanner;
//Lower or Upper
public class Lower_or_Upper {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();

        checkPassword(a);
    }

    public static void checkPassword(String a){
        boolean upperCase = !a.equals(a.toUpperCase()); //check if the input has a upper case letter

        if(!upperCase){
            System.out.println("upper-case");
        }else {
            System.out.println("lower-case");
        }
    }
}
