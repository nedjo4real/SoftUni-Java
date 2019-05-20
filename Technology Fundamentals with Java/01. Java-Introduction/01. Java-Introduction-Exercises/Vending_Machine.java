package Introduction.exersices;

import java.util.Scanner;
//Vending Machine
public class Vending_Machine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String coinsInput = "";
        double sum =0;
        while (!"Start".equals(coinsInput = scan.nextLine())){
            double nn= Double.parseDouble(coinsInput);
            if(nn==0.1||nn==0.2||nn==0.5||nn==1||nn==2){
                sum += nn;
            }else {
                System.out.println(String.format("Cannot accept %.2f", Double.parseDouble(coinsInput)));
            }
        }

        String productInput = scan.nextLine();
        while(!"End".equals(productInput)){
            switch (productInput){
                case "Nuts":
                    if(sum>=2.0){
                        sum-=2.0;
                        System.out.println("Purchased " + productInput);
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if(sum>=0.7){
                        sum-=0.7;
                        System.out.println("Purchased " + productInput);
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if(sum>=1.5){
                        sum-=1.5;
                        System.out.println("Purchased " + productInput);
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if(sum>=0.8){
                        sum-=0.8;
                        System.out.println("Purchased " + productInput);
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if(sum>=1.0){
                        sum-=1.0;
                        System.out.println("Purchased " + productInput);
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            productInput = scan.nextLine();
        }

        System.out.println(String.format("Change: %.2f", sum));
    }
}
