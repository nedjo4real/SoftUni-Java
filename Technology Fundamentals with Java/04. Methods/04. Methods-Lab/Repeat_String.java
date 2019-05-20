import java.util.Scanner;
//Repeat String
public class Repeat_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int repeat = Integer.parseInt(scan.nextLine());
        String res = repeatString(word, repeat);
        System.out.println(res);
    }
    public static String repeatString(String word, int repeat){
        String result = "";

        for (int i = 0; i < repeat; i++) {
            result+=word;
        }

        return result;
    }
}
