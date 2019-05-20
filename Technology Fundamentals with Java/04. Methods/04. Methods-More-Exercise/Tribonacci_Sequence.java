import java.util.Scanner;
//Tribonacci Sequence
public class Tribonacci_Sequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstMembers = Integer.parseInt(scan.nextLine());

        if(firstMembers == 1){
            System.out.println("1");
        }else if (firstMembers == 2) {
            System.out.println("1 1 ");
        }else {

            int[] fibonacci = new int[firstMembers];
            fibonacci[0] = 1;
            fibonacci[1] = 1;
            fibonacci[2] = 2;
            for (int i = 3; i < firstMembers; i++) {
                fibonacci[i] = fibonacci[i - 3] + fibonacci[i - 2] + fibonacci[i - 1];
            }
            for (int i = 0; i < firstMembers; i++) {
                System.out.print(fibonacci[i] + " ");
            }
        }
    }
}
