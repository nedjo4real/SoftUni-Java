import java.util.Scanner;
//Sign of Integer
public class Sign_of_Integer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        printwhatisit(n);
    }

    public static void printwhatisit(int n) {
        if(n>0){
            System.out.println("The number "+n+" is positive.");
        }else if(n<0){
            System.out.println("The number "+n+" is negative.");
        }else{
            System.out.println("The number "+n+" is zero.");
        }
    }
}
