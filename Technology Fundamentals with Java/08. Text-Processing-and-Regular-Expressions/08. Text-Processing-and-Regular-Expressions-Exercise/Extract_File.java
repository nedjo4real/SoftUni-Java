import java.util.Scanner;
//Extract File
public class Extract_File {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] path = scan.nextLine().split("\\\\");

        String ext = path[path.length - 1]
                .substring(path[path.length - 1].lastIndexOf(".") + 1);
        String name  = path[path.length - 1]
                .substring(path[path.length - 1].lastIndexOf("\\") + 1, path[path.length - 1].lastIndexOf("."));

        System.out.printf("File name: %s\n", name);
        System.out.printf("File extension: %s\n", ext);

    }
}
