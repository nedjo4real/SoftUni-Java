import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Set<String> usernames = new LinkedHashSet<>();

        int m = Integer.parseInt(scan.nextLine());


        while(m-- >0){
            String username = scan.nextLine();
            usernames.add(username);
        }

        for (String username : usernames) {
            System.out.println(username);
        }
    }
}
