package Introduction.exersices;

import java.util.Scanner;
//*Rage Expenses
public class Rage_Expenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lostGamesCount = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());

        double expenses = (lostGamesCount/2) * headsetPrice
                + (lostGamesCount/3) * mousePrice
                + (lostGamesCount/6) * keyboardPrice
                + (lostGamesCount/12) * displayPrice;

        System.out.println(String.format("Rage expenses: %.2f lv.", expenses));
    }
}
