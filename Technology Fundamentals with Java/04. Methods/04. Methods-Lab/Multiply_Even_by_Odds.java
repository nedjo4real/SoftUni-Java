import java.util.Scanner;
//Multiply Evens by Odds
public class Multiply_Even_by_Odds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        int even = 0;
        int odd = 0;

        while(number!=0){
            int temp = number;
            temp=number%10;
            if(temp%2==0){
                even+=temp;
            }else {
                odd+=temp;
            }
            number/=10;
        }
        System.out.println(multiply(even,odd));
    }

    private static int multiply(int even, int odd){
        return even*odd;
    }

}
