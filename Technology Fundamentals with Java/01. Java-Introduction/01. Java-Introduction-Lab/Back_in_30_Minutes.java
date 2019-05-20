package Introduction.lab;

import java.util.Scanner;
//Back in 30 Minutes
public class Back_in_30_Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = Integer.parseInt(scan.nextLine());
        int min = Integer.parseInt(scan.nextLine());

        int reshour = hours;
        int resmin = min+30;

        if(resmin>=60){
            reshour+=1;
            resmin-=60;
        }
        if(reshour>23){
            reshour=0;
        }
        if(resmin<10){
        System.out.println(reshour + ":0" + resmin);
        }else {
        System.out.println(reshour + ":" + resmin);
        }
    }
}
