import java.util.Scanner;
//Factorial Division
public class Factorial_Division {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        double result = (double) calculate(a)/(double) calculate(b);

        System.out.printf("%.2f",result);

    }

    static long calculate(int n){
        long factoriel = 1;

        if(n>0){
            for (int i = 2; i <= n; i++) {
                factoriel*=i;
            }
        }else if (n<0){
            factoriel=n;

        }

        return factoriel;
    }
}
