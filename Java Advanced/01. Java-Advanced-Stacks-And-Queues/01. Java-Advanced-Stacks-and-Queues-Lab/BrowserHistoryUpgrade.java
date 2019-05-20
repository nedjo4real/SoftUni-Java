import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        ArrayDeque<String> browserForwardHistory = new ArrayDeque<>();
        String command = scan.nextLine();
        while (!command.equals("Home")){

            if(command.equals("forward")){
                if(browserForwardHistory.isEmpty()){
                    System.out.println("no next URLs");
                    command = scan.nextLine();
                    continue;
                }
                else{
                    String forwardUrl = browserForwardHistory.poll();
                    browserHistory.push(forwardUrl);
                    System.out.println(forwardUrl);
                    command = scan.nextLine();
                    continue;
                }
            }

            else if(command.equals("back")){
                if(browserHistory.size() < 2){
                    System.out.println("no previous URLs");
                    command = scan.nextLine();
                    continue;
                }
                else{
                    String currentUrl = browserHistory.pop();
                    String previousUrl = browserHistory.pop();
                    browserHistory.push(previousUrl);
                    browserForwardHistory.push(currentUrl);
                    System.out.println(previousUrl);
                    command = scan.nextLine();
                    continue;
                }
            }
            System.out.println(command);
            browserHistory.push(command);
            browserForwardHistory.clear();
            command = scan.nextLine();
        }
    }
}