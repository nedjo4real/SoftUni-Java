import java.util.Scanner;
//Beer Kegs
public class Beer_Kegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kegsCount = Integer.parseInt(scan.nextLine());
        String biggestKegModel = "";
        double biggestKegVolume = 0;
        float pi = (float)Math.PI;
        while (kegsCount > 0)
        {
            String currentKegModel = scan.nextLine();
            float kegRadius = Float.parseFloat(scan.nextLine());
            int kegHeight = Integer.parseInt(scan.nextLine());
            double currentVolume = (double)pi * kegRadius * kegRadius * kegHeight;
            if (currentVolume > biggestKegVolume)
            {
                biggestKegVolume = currentVolume;
                biggestKegModel = currentKegModel;
            }
            kegsCount--;
        }
        System.out.println(biggestKegModel);
    }
}
