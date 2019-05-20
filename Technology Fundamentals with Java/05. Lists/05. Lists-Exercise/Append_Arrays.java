import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Collections;
//Append Arrays
public class Append_Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> arrays = Arrays.stream(scan.nextLine().split("\\|")).collect(Collectors.toList());
        Collections.reverse(arrays);
        String toPrint = arrays.toString().replaceAll("[\\]\\[,]", "").trim();
        toPrint = toPrint.replaceAll("\\s+", " ");

        System.out.println(toPrint);
    }
}
