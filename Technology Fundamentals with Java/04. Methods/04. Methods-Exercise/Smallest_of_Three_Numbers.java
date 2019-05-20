import java.util.Scanner;
//Smallest of Three Numbers
public class Smallest_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());

        smallestNumber(a,b,c);
    }

    public static void smallestNumber(int a, int b, int c){
        if(a<b && a<c){
            System.out.println(a);
        }else if(b<c && b<a){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
