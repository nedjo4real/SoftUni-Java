import java.text.DecimalFormat;
import java.util.Scanner;
//Math Operations
public class Math_Operations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        int secondNumber = Integer.parseInt(scan.nextLine());

        DecimalFormat df = new DecimalFormat("0.########");

        System.out.println(df.format(calculate(firstNumber,operator,secondNumber)));
    }

     private static double calculate(int firstNumber, String operator, int secondNumber){
        double result = 0.0;
        switch (operator){
            case "*":
                result = firstNumber*secondNumber;
                break;
            case "/":
                result = firstNumber/secondNumber;
                break;
            case "+":
                result = firstNumber+secondNumber;
                break;
            case "-":
                result = firstNumber-secondNumber;
                break;
        }

        return result;
    }
}
