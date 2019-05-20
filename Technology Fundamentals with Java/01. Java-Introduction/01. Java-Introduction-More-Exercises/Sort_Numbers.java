package Introduction.more_exersices;

import java.util.Scanner;
//Sort Numbers
public class Sort_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        if(num1>num2 && num1>num3){
            System.out.println(num1);
            if(num2>num3){
                if(num2==0){
                    System.out.println("0");
                }else {
                    System.out.println(num2);
                }
                if(num3==0){
                    System.out.println("0");
                }else{
                    System.out.println(num3);
                }
            }else if(num3>=num2) {
                if (num3 == 0) {
                    System.out.println("0");
                } else {
                    System.out.println(num3);
                }
                if (num2 == 0) {
                    System.out.println("0");
                } else {
                    System.out.println(num2);
                }
            }
        }else if(num2>num1 && num2>num3){
            System.out.println(num2);
            if(num1>num3){
                if (num1 == 0) {
                    System.out.println("0");
                } else {
                    System.out.println(num1);
                }
                if (num3 == 0) {
                    System.out.println("0");
                } else {
                    System.out.println(num3);
                }
            }else if(num3>=num1){
                if (num3 == 0) {
                    System.out.println("0");
                } else {
                    System.out.println(num3);
                }
                if (num1 == 0) {
                    System.out.println("0");
                } else {
                    System.out.println(num1);
                }
            }
        }else {
            System.out.println(num3);
            if(num2>num1){
                if (num2 == 0) {
                    System.out.println("0");
                } else {
                    System.out.println(num2);
                }
                if (num1 == 0) {
                    System.out.println("0");
                } else {
                    System.out.println(num1);
                }
            }else if(num1>=num2){
                if (num1 == 0) {
                    System.out.println("0");
                } else {
                    System.out.println(num1);
                }
                if (num2 == 0) {
                    System.out.println("0");
                } else {
                    System.out.println(num2);
                }
            }
        }
    }
}
