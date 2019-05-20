import java.util.Arrays;
import java.util.Scanner;
//Zig-Zak Arrays
public class Zig_Zag_Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] zig = new int[n];
        int[] zag = new int[n];

        for (int i = 0; i < n; i++) {
            int[] zigzag = Arrays.stream(scan.nextLine().split(" "))
                    .mapToInt(e -> Integer.parseInt(e))
                    .toArray();
            for (int j = 0; j < zigzag.length - 1; j++) {
                zag[i] = zigzag[j];
                zig[i] = zigzag[j + 1];
            }
        }
        for (int i = 0; i < n; i+= 2){
            int temp = 0;
            temp = zag[i];
            zag[i] = zig[i];
            zig[i] = temp;
        }

        for(int each : zig){
            System.out.print(each+" ");
        }
        System.out.println();
        for(int each : zag){
            System.out.print(each+" ");
        }
    }
}
