import java.util.Scanner;
//Sum of chars
public class Sum_of_chars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int res = 0;
        for (int i = 0; i < n; i++) {
            char a = scan.next().charAt(0);
            res+=a;
        }
        System.out.println("The sum equals: "+ res);
    }
}
