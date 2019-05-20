import java.util.Scanner;
//Concat Names
public class Concat_Names {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name1 = scan.nextLine();
        String name2 = scan.nextLine();
        String c = scan.nextLine();
        System.out.println(name1+c+name2);
    }
}
