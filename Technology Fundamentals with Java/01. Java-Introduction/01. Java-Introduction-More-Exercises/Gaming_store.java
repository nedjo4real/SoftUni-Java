package Introduction.more_exersices;

import java.util.Scanner;
//Gaming store
public class Gaming_store {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String gameName = "";
        double gamePrice = 0;
        double spentOnGames =0;
        gameName = scan.nextLine();
        while(!"Game Time".equals(gameName)){
            switch (gameName){
                case ("OutFall 4"):
                    gamePrice=39.99;
                    if(budget>gamePrice){
                        budget-=gamePrice;
                        spentOnGames+=gamePrice;
                        System.out.println("Bought " + gameName);
                    }else if(budget<gamePrice){
                        System.out.println("Too Expensive");
                    }
                    if(budget==0){
                        System.out.println("Out of mo-ney!");
                        break;
                    }
                    break;
                case ("CS: OG"):
                    gamePrice=15.99;
                    if(budget>gamePrice){
                        budget-=gamePrice;
                        spentOnGames+=gamePrice;
                        System.out.println("Bought " + gameName);
                    }else if(budget<gamePrice){
                        System.out.println("Too Expensive");
                    }
                    if(budget==0){
                        System.out.println("Out of mo-ney!");
                        break;
                    }
                    break;
                case ("Zplinter Zell"):
                    gamePrice=19.99;
                    if(budget>gamePrice){
                        budget-=gamePrice;
                        spentOnGames+=gamePrice;
                        System.out.println("Bought " + gameName);
                    }else if(budget<gamePrice){
                        System.out.println("Too Expensive");
                    }
                    if(budget==0){
                        System.out.println("Out of mo-ney!");
                        break;
                    }
                    break;
                case ("Honored 2"):
                    gamePrice=59.99;
                    if(budget>gamePrice){
                        budget-=gamePrice;
                        spentOnGames+=gamePrice;
                        System.out.println("Bought " + gameName);
                    }else if(budget<gamePrice){
                        System.out.println("Too Expensive");
                    }
                    if(budget==0){
                        System.out.println("Out of mo-ney!");
                        break;
                    }
                    break;
                case ("RoverWatch"):
                    gamePrice=29.99;
                    if(budget>gamePrice){
                        budget-=gamePrice;
                        spentOnGames+=gamePrice;
                        System.out.println("Bought " + gameName);
                    }else if(budget<gamePrice){
                        System.out.println("Too Expensive");
                    }
                    if(budget==0){
                        System.out.println("Out of mo-ney!");
                        break;
                    }
                    break;
                case ("RoverWatch Origins Edition"):
                    gamePrice=39.99;
                    if(budget>gamePrice){
                        budget-=gamePrice;
                        spentOnGames+=gamePrice;
                        System.out.println("Bought " + gameName);
                    }else if(budget<gamePrice){
                        System.out.println("Too Expensive");
                    }
                    if(budget==0){
                        System.out.println("Out of mo-ney!");
                        break;
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            gameName = scan.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spentOnGames, budget);
    }
}
