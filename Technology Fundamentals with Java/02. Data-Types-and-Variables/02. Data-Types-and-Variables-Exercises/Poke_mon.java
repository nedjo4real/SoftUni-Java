import java.util.Scanner;
//*Poke mon
public class Poke_mon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());
        int y = Integer.parseInt(scan.nextLine());

        double nDividedByTwo = n / 2.0;

        int cnt = 0;
        while (n >= m)
        {
            if (n == nDividedByTwo)
            {
                if(y != 0)
                {
                    n = n / y;
                }
                if (n >= m)
                {
                    n = n - m;
                    cnt++;
                }
            }
            else
            {
                n = n - m;
                cnt++;
            }

        }
        System.out.println(n);
        System.out.println(cnt);
    }
}
