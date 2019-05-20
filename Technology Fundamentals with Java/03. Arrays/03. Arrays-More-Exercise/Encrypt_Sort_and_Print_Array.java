import java.util.Scanner;
import java.util.Arrays;
//Encrypt Sort and Print Array
public class Encrypt_Sort_and_Print_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countNames = Integer.parseInt(scan.nextLine());
        String[] names = new String[countNames];
        int[] sums = new int[names.length];

        for (int i = 0; i < names.length; i++) {
            names[i] = scan.nextLine().trim();
            sums[i] = getResult(names[i]);
        }

        int[] sortedArray = sort(sums);

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }
    }

    private static int[] sort(int[] sums) {
        int temp = 0;
        for (int i = 0; i < sums.length; i++) {
            for (int j = 1; j < (sums.length - i); j++) {
                if (sums[j - 1] > sums[j]) {
                    temp = sums[j - 1];
                    sums[j - 1] = sums[j];
                    sums[j] = temp;
                }
            }
        }
        return sums;
    }

    private static int getResult(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                sum += (int) str.charAt(i) * str.length();
            } else {
                sum += (int) str.charAt(i) / str.length();
            }
        }
        return sum;
    }

    private static boolean isVowel(char symbol) {

        return "aeiouAEIOU".contains(String.valueOf(symbol));
    }
}
