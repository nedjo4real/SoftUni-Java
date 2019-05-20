import java.util.Scanner;
//Refactor Volume of Pyramid
public class Refactor_Volume_of_Pyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double dul, sh, V = 0;
        System.out.print("Length: ");
        dul = Double.parseDouble(scan.nextLine());
        System.out.print("Width: ");
        sh = Double.parseDouble(scan.nextLine());
        System.out.print("Height: ");
        V = Double.parseDouble(scan.nextLine());
        V = (dul * sh * V) / 3;
        System.out.printf("Pyramid Volume: %.2f", V);
    }
}
