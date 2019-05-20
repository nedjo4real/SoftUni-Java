import java.util.Scanner;
//Water Overflow
public class Water_Overflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int waterTank = 0;
        int liters = 0;
        for (int i = 0; i < n; i++) {
             liters = Integer.parseInt(scan.nextLine());
             if(liters+waterTank>255) {
                 System.out.println("Insufficient capacity!");
             }else if(liters<=255 && waterTank<=255){
                 waterTank+=liters;
             }
        }
        System.out.println(waterTank);
    }
}
