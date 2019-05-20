package Introduction.lab;

import java.util.Scanner;
//Even Number
public class Even_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        n = Math.abs(n);
        if(n%2==0){
            System.out.println("The number is: " + n);
        }else {
            System.out.println("Please write an even number.");
        }
            while (n % 2 != 0) {
                n = Integer.parseInt(scan.nextLine());
                n = Math.abs(n);
                if (n % 2 == 0) {
                    System.out.println("The number is: " + n);
                }else{
                    System.out.println("Please write an even number.");
                }
            }
    }
}

