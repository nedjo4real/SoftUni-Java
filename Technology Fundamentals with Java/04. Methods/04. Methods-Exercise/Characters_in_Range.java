import java.util.Scanner;
//Characters in Range
public class Characters_in_Range {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char a = scan.nextLine().charAt(0);
        char b = scan.nextLine().charAt(0);

        int a1 = (int) a;
        int b1 = (int) b;

        if(a1>b1){
            int temp = b1;
            b1=a1;
            a1=temp;
        }

        for (int i = a1+1; i < b1; i++) {
            char ab = (char) i;
            String ab1 = "" + ab;
            System.out.print(ab1+ " ");
        }

    }
}
