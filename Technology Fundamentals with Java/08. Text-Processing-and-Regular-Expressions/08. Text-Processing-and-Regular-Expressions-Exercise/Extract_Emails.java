import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Extract Emails
public class Extract_Emails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        String regex = "\\s[A-Za-z][\\w.-]*@[A-Za-z-]+(\\.[A-Za-z]+)+";
        Pattern emailPattern = Pattern.compile(regex);
        Matcher matcher = emailPattern.matcher(text);
        while (matcher.find()) {
            System.out.print(matcher.group());
            System.out.println();
        }
    }
}
