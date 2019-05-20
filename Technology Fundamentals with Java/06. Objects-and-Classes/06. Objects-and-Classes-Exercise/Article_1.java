import java.util.Scanner;
//Article
public class Article_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] tokens = scan.nextLine().split(", ");
        String title = tokens[0];
        String content = tokens[1];
        String author = tokens[2];

        articles article = new articles(title, content, author);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] action = scan.nextLine().split(": ");

            if (action[0].equals("Edit")) {
                article.Edit(action[1]);
            } else if (action[0].equals("ChangeAuthor")) {
                article.ChangeAuthor(action[1]);
            } else if (action[0].equals("Rename")) {
                article.Rename(action[1]);
            }
        }

        article.ToStringg();
    }
}


class articles {
    public String Title;
    public String Content;
    public String Author;

    public articles(String title, String content, String author) {
        this.Title = title;
        this.Content = content;
        this.Author = author;
    }

    public void Edit(String content) {
        this.Content = content;
    }

    public void ChangeAuthor(String newAuthor) {
        this.Author = newAuthor;
    }

    public void Rename(String title) {
        this.Title = title;
    }

    public void ToStringg() {
        System.out.printf("%s - %s: %s%n", Title, Content, Author);
    }
}
