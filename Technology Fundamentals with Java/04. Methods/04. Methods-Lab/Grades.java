import java.util.Scanner;
//Grades
public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double grade = Double.parseDouble(scan.nextLine());
        printGrade(grade);
    }

    public static void printGrade(double grade) {
        if(grade>=5.50){
            System.out.println("Excellent");
        }else if(grade>=4.50){
            System.out.println("Very good");
        }else if(grade>=3.50){
            System.out.println("Good");
        }else if(grade>=3.00){
            System.out.println("Poor");
        }else {
            System.out.println("Fail");
        }
    }

}
