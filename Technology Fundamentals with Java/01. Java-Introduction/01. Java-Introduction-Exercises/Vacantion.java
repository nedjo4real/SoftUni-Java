package Introduction.exersices;

import java.text.DecimalFormat;
import java.util.Scanner;
//Vacantion
public class Vacantion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = Double.parseDouble(scan.nextLine());
        String clas = scan.nextLine();
        String day = scan.nextLine();
        double price = 0;
        if(day.equals("Friday")){
            if(clas.equals("Students")){
                price=8.45;
            }else if(clas.equals("Business")){
                price=10.90;
            }else if(clas.equals("Regular")){
                price=15;
            }
        }else if(day.equals("Saturday")){
            if(clas.equals("Students")){
                price=9.80;
            }else if(clas.equals("Business")){
                price=15.60;
            }else if(clas.equals("Regular")){
                price=20;
            }
        }else if(day.equals("Sunday")){
            if(clas.equals("Students")){
                price=10.46;
            }else if(clas.equals("Business")){
                price=16;
            }else if(clas.equals("Regular")){
                price=22.50;
            }
        }
        double total = price*num;
        double disc=0;
        if(clas.equals("Students")){
            if(num>=30){
                disc=total*0.15;
                total-=disc;
            }
        }else if(clas.equals("Business")){
            if(num>=100){
                disc=price*10;
                total-=disc;
            }
        }else if(clas.equals("Regular")){
            if(num>=10 && num<=20){
                disc=total*0.05;
                total-=disc;
            }
        }
        System.out.printf("Total price: %.2f", total);
    }
}