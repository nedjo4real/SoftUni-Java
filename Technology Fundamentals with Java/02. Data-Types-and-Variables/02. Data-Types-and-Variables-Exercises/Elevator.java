import java.util.Scanner;
//Elevator
public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = Double.parseDouble(scan.nextLine());
        double p = Double.parseDouble(scan.nextLine());
        int courses = (int) Math.ceil((double) n/p);
        System.out.println(courses);
    }
}
