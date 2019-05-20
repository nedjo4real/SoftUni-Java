import java.util.Scanner;
//*Spice Must Flow
public class Spice_Must_Flow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long mine = Integer.parseInt(scan.nextLine());
        long harvest = 0;
        long days = 0;

        if(mine >=100 ){
            do{
                days++;
                harvest = (harvest + mine) - 26;
                mine = mine - 10;
            }while(mine >= 100);
            harvest = harvest - 26;
            System.out.printf("%d%n%d", days,harvest);
        }else{
            System.out.printf("%d%n%d",0,0);
        }

    }
}
