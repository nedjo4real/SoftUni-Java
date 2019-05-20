package Introduction.exersices;

import java.util.Scanner;
//*Pandawan Equipment
public class Pandawan_Equipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int students = Integer.parseInt(scan.nextLine());
        double priceLightsabers = Double.parseDouble(scan.nextLine());
        double priceRobes = Double.parseDouble(scan.nextLine());
        double priceBelts = Double.parseDouble(scan.nextLine());
        double beltprice = priceBelts*(students-students/6);
        double price = priceLightsabers*(students + Math.ceil(students*0.10))+(priceRobes*students) + beltprice;
        double need = Math.abs(budget-price);
        if(price<=budget){
            System.out.printf("The money is enough - it would cost %.2flv. ", price);
        }else{
            System.out.printf("Ivan Cho will need %.2flv more.", need);
        }
    }
}
