package Introduction.lab;

import java.util.Scanner;
//Foreign Languages
public class Foreign_Languages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String language = scan.nextLine();

        if(language.equals("USA") || language.equals("England")){
            System.out.println("English");
        }else if (language.equals("Argentina") || language.equals("Mexico") || language.equals("Spain")){
            System.out.println("Spanish");
        }else{
            System.out.println("unknown");
        }
    }
}
