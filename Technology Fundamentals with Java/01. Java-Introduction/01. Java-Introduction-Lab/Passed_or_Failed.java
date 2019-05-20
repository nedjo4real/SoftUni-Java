package Introduction.lab;

import java.util.Scanner;
//Passed or Failed
public class Passed_or_Failed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double grade = Double.parseDouble(scan.nextLine());

        if(grade>=3){
            System.out.println("Passed!");
        }else{
            System.out.println("Failed!");
        }
    }
}