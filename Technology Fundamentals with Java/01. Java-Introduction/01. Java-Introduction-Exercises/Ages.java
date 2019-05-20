package Introduction.exersices;

import java.util.Scanner;
//Ages
public class Ages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());

        if(age<=2){
            System.out.println("baby");
        }else if (age>=3 && 13>=age){
            System.out.println("child");
        }else if(age>=14 && 19>=age){
            System.out.println("teenager");
        }else if(age>=20 && 65>=age){
            System.out.println("adult");
        }else {
            System.out.println("elder");
        }
    }
}
