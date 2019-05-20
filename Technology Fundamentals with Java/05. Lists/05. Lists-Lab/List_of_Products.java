import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Collections;
//List of Products
public class List_of_Products {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<String> products = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String currentProduct = scan.nextLine();
            products.add(currentProduct);
        }
        Collections.sort(products);
        for (int i = 0; i < products.size(); i++)
            System.out.printf("%d.%s%n", i + 1, products.get(i));


    }
}
