import java.util.Scanner;
//Middle Characters
public class Middle_Characters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        char[] digits = word.toCharArray();

        int res = 0;
        int count = 0;

        if(digits.length % 2 != 0){
            res = digits.length/2 + 1;
            count ++;
        }else {
            res = digits.length/2;
        }

        if(count == 0){
            System.out.println(digits[res-1] + ""+digits[res]);
        }else{
            System.out.println(digits[res-1]);
        }
    }
}
