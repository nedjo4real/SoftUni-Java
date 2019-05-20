package Introduction.more_exersices;

import java.util.Scanner;
//English Name of the last digit
public class English_Name_of_the_last_digit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int res = num%10;
        if(res==1){
            System.out.println("one");
        }else if(res==2){
            System.out.println("two");
        }else if(res==3){
            System.out.println("three");
        }else if(res==4){
            System.out.println("four");
        }else if(res==5){
            System.out.println("five");
        }else if(res==6){
            System.out.println("six");
        }else if(res==7){
            System.out.println("seven");
        }else if(res==8){
            System.out.println("eight");
        }else if(res==9){
            System.out.println("ninw");
        }else if(res==0){
            System.out.println("zero");
        }
    }
}
