import java.text.DecimalFormat;
import java.util.Scanner;
//Snowballs
public class Snowballs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        double snowballValue = 0;
        int lastsnowballSnow = 0;
        int lastsnowballTime = 0;
        int lastsnowballQuality = 0;
        double lastsnowballValue = 0;

        DecimalFormat df = new DecimalFormat("#");
        df.setMinimumFractionDigits(0);
        df.setMaximumFractionDigits(0);

        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(scan.nextLine());
            int snowballTime = Integer.parseInt(scan.nextLine());
            int snowballQuality = Integer.parseInt(scan.nextLine());
            snowballValue = (snowballSnow/snowballTime);
            snowballValue = (double) Math.pow(snowballValue,snowballQuality);
            if(lastsnowballValue<snowballValue){
                lastsnowballQuality = snowballQuality;
                lastsnowballSnow = snowballSnow;
                lastsnowballTime = snowballTime;
                lastsnowballValue = snowballValue;
            }
        }
        //{snowballSnow} : {snowballTime} = {snowballValue} ({snowballQuality})
        System.out.println(lastsnowballSnow + " : " + lastsnowballTime + " = " +
                df.format(lastsnowballValue) +" ("+lastsnowballQuality+")");

    }
}
