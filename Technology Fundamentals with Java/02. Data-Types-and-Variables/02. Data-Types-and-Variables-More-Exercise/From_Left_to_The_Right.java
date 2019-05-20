import java.util.Scanner;
//From Left to The Right
public class From_Left_to_The_Right {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lineNumber = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < lineNumber; i++) {
            long sum = 0;
            String currLine = scan.nextLine();
            String[] splitLine = currLine.split(" ");
            long firstInt = Long.parseLong(splitLine[0]);
            long secondInt = Long.parseLong(splitLine[1]);
            if (firstInt >= secondInt) {
                firstInt = Math.abs(firstInt);
                while (firstInt > 0) {
                    sum += firstInt %10;
                    firstInt/=10;
                }
            } else {
                secondInt = Math.abs(secondInt);
                while (secondInt > 0) {
                    sum += secondInt % 10;
                    secondInt /= 10;
                }
            }
            System.out.println(sum);
        }
    }
}
