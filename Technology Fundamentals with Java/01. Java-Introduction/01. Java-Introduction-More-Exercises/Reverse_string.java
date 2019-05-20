package Introduction.more_exersices;

import java.util.Scanner;
//Reverse string
public class Reverse_string {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str1 = new StringBuffer(str).reverse().toString();
        System.out.println(str1);
    }
}
