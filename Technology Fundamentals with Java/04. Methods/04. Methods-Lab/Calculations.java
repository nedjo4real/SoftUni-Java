import java.util.Scanner;
//Calculations
public class Calculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String action = scan.nextLine();
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        switch (action){
            case "divide":
                divide(a,b);
                break;
            case "add":
                add(a,b);
                break;
            case "subtract":
                subtract(a,b);
                break;
            case "multiply":
                multiply(a,b);
                break;
        }
    }

    public static void add(int a, int b) {
        System.out.println(a+b);
    }
    public static void divide(int a, int b) {
        System.out.println(a/b);
    }
    public static void multiply(int a, int b) {
        System.out.println(a*b);
    }
    public static void subtract(int a, int b) {
        System.out.println(a-b);
    }
}
