import java.util.Scanner;
//Character Multiplier
public class Character_Multiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] strings = scan.nextLine().split(" ");

        int sum = GetSum(strings[0], strings[1]);
        System.out.println(sum);
    }

    public static int GetSum(String first, String second)
    {
        int sum = 0;
        int minLen = Math.min(first.length(), second.length());
        int maxLen = Math.max(first.length(), second.length());
        String maxString = "";
        int count = 0;

        if (first.length()== maxLen)
        {
            maxString = first;
        }
        else
        {
            maxString = second;
        }

        for (int i = 0; i < minLen; i++)
        {
            sum += first.charAt(i) * second.charAt(i);
            count = i;
        }

        for (int i = count + 1; i < maxLen; i++)
        {
            sum += maxString.charAt(i);
        }
        return sum;

    }
}
