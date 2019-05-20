package Introduction.exersices;

import java.util.Scanner;
//Login
public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String user = scan.nextLine();
        String pass =  new StringBuffer(user).reverse().toString();
        String pas = scan.nextLine();
        int count = 1;
        while(!pas.equals(pass)){
            if(count++ == 4){
            System.out.println("User " + user + " blocked!" );
            return;
            }
            System.out.println("Incorrect password. Try again.");
            pas = scan.nextLine();
        }
        System.out.printf("User %s logged in. \n", user);
    }
}
