import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
//Cards Game
public class Cards_Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> cardNumbers1 =
                Arrays.stream(scan.nextLine()
                        .split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        List<Integer> cardNumbers2 =
                Arrays.stream(scan.nextLine()
                        .split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());


        int i = 0;
        while(cardNumbers1.size()!=0 && cardNumbers2.size()!=0){
            int num1 = cardNumbers1.get(i);
            int num2 = cardNumbers2.get(i);
            if(num1>num2){
                cardNumbers1.add(num1);
                cardNumbers1.add(num2);
                cardNumbers1.remove(i);
                cardNumbers2.remove(i);
                i=-1;
            }else if(num2>num1){
                cardNumbers2.add(num2);
                cardNumbers2.add(num1);
                cardNumbers1.remove(i);
                cardNumbers2.remove(i);
                i=-1;
            }else if (num1 == num2){
                cardNumbers1.remove(i);
                cardNumbers2.remove(i);
                i=-1;
            }
            i++;
        }

        if(cardNumbers1.size()>cardNumbers2.size()){
            System.out.println("First player wins! Sum: "+sum(cardNumbers1));
        }else{
            System.out.println("Second player wins! Sum: "+sum(cardNumbers2));
        }

    }
    private static int sum(List<Integer> num){
        int sum = 0;
        for (int i = 0; i < num.size(); i++) {
            sum += num.get(i);
        }
        return sum;
    }
}
