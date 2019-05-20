package Introduction.lab;

import java.util.Scanner;
//Theatre Promotions
public class Theatre_Promotions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String day = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        int price = 0;

        if(age<=18 && age>=0){
            if(day.equals("Weekday")){
                price = 12;
            }else if(day.equals("Weekend")){
                price = 15;
            }else if(day.equals("Holiday")){
                price = 5;
            }
        }else if (age>18 && age<=64){
            if(day.equals("Weekday")){
                price = 18;
            }else if(day.equals("Weekend")){
                price = 20;
            }else if(day.equals("Holiday")){
                price = 12;
            }
        }else if(age>64 && age<=122){
            if(day.equals("Weekday")){
                price = 12;
            }else if(day.equals("Weekend")){
                price = 15;
            }else if(day.equals("Holiday")){
                price = 10;
            }
        }

        if (age >= 123 || age < 0){
            System.out.println("Error!");
        }else {
            System.out.println(price + "$");
        }
    }
}
