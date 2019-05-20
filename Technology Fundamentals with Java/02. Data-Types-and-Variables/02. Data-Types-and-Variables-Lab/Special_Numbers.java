import java.util.Scanner;
//Special Numbers
public class Special_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int num = 0;
        int temp = 0;

        for (int i = 1; i <= n; i++) {
            double sumDigits = 0;
            num=i;
            while (num!=0) {
                temp = num%10;
                sumDigits += temp;
                num/=10;
            }
            if(checkNumber(sumDigits)){
                System.out.println(i + " -> True");
            }else{
                System.out.println(i + " -> False");
            }
        }
    }
    public static boolean checkNumber(double sumDigits ){

        if(sumDigits==5 || sumDigits==7 || sumDigits==11){
            return true;
        }else{
            return false;
        }
    }
}
