import java.util.Scanner;
//Common Elements
public class Common_Elements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] firstElements = scan.nextLine().split(" ");
        String[] secondElements = scan.nextLine().split(" ");

        for (int i = 0; i < secondElements.length; i++) {
            for (int j = 0; j < firstElements.length; j++) {
                if (secondElements[i].equals(firstElements[j])) {
                    System.out.print(secondElements[i]+" ");
                }
            }
        }
    }
}
