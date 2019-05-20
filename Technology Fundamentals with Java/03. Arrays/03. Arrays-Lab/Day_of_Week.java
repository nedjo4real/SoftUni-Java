import java.util.Scanner;
//Day of Week
public class Day_of_Week {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] dayofweek = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        int n = Integer.parseInt(scan.nextLine());

        if(n<=0 || n>=8){
            System.out.println("Invalid day!");
        }else {
            System.out.println(dayofweek[n-1]);
        }
    }
}
