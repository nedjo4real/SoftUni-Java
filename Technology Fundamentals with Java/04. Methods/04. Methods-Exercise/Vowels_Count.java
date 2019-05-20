import java.util.Scanner;
//Vowels Count
public class Vowels_Count {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        counter(word);
    }
    public static void counter(String word){

        int counter = 0;

        char[] arr = word.toCharArray();

        char[] vowels = new char[]{'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if(arr[i] == vowels[j])counter++;
            }
        }

        System.out.println(counter);
    }
}
