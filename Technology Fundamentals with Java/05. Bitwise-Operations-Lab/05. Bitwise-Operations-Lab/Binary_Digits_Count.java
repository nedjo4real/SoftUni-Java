import java.util.Scanner;
//Binary Digits Count
public class Binary_Digits_Count {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bit = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());
        int counter = 0;

        String binary = Integer.toBinaryString(bit);

        char[] raw = binary.toCharArray();

        int[] bin = new int[raw.length];

        for (int i = 0; i < raw.length; i++){
            bin[i] = (int)raw[i]- '0';
        }

        for (int i = 0; i < bin.length; i++) {
            if (n == bin[i]) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}