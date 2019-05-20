import java.util.Scanner;
//Resursive Fibonacci
public class Recursive_Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        System.out.println(fibonacci(n));
    }
    public static long fibonacci(int i)
    {
        if (i == 0) return 0;
        if (i <= 2) return 1;

        long fibTerm = fibonacci(i - 1) + fibonacci(i - 2);
        return fibTerm;
    }
}