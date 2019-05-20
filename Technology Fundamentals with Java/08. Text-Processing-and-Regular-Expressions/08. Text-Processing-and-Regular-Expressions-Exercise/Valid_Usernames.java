import java.util.Scanner;
//Valid Usernames
public class Valid_Usernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] names = scan.nextLine().split(", ");

        for (String name : names)
        {
            boolean flag = true;

            if (name.length() >= 3 && name.length() <= 16)
            {
                for (char symbol : name.toCharArray())
                {
                    if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_')
                    {
                        flag = false;
                        break;
                    }
                }

                if (flag)
                {
                    System.out.println(name);
                }
            }
        }
    }
}
