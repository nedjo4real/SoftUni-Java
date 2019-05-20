import java.util.Scanner;
//Balanced Brackets
public class Balanced_Brackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scan.nextLine());
        boolean isLocked = false;
        int openingBracketsCount = 0;
        int closingBracketsCount = 0;

        for (int i = 0; i < numberOfLines; i++)
        {
            String currentString = scan.nextLine();
            if (currentString.length() == 1)
            {
                char currentChar = currentString.charAt(0);
                openingBracketsCount += currentChar == '(' ? (byte)1 : (byte)0;
                closingBracketsCount += currentChar == ')' ? (byte)1 : (byte)0;
                if (!(openingBracketsCount == closingBracketsCount ||
                        openingBracketsCount == closingBracketsCount + 1))
                {
                    isLocked = true;
                }
            }

        }
        boolean isBalances = openingBracketsCount == closingBracketsCount;
        System.out.println(isBalances && !isLocked ? "BALANCED" : "UNBALANCED");
    }
}
