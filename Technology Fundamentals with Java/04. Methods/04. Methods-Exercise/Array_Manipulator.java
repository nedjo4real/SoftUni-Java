import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
//*Array Manipulator
public class Array_Manipulator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );
        String[] inputData = reader.readLine().split("\\s+");

        int[] numbers = new int[inputData.length];

        for (int i = 0; i < inputData.length; i++) {
            numbers[i] = Integer.parseInt(inputData[i]);
        }

        String input = "";

        while (!"end".equals(input = reader.readLine())) {
            String[] data = input.split("\\s+");

            String command = data[0];

            switch (command) {
                case "exchange":
                    exchangeArray(numbers, Integer.parseInt(data[1]));
                    break;
                case "min":
                    minElementIndex(numbers, data[1]);
                    break;
                case "max":
                    maxElementIndex(numbers, data[1]);
                    break;
                case "first":
                    firstCountElements(numbers, Integer.parseInt(data[1]), data[2]);
                    break;
                case "last":
                    lastCountElements(numbers, Integer.parseInt(data[1]), data[2]);
                    break;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    private static void firstCountElements(int[] numbers, int count, String command) {
        if (validateCount(numbers, count)) return;

        int num = command.equals("even") ? 0 : 1;

        int index = 0;

        fillElementsByCriteria(numbers, count, num, index, "first");
    }

    private static void lastCountElements(int[] numbers, int count, String command) {
        if (validateCount(numbers, count)) return;

        int num = command.equals("even") ? 0 : 1;
        int index = 0;
        fillElementsByCriteria(numbers, count, num, index, "last");
    }

    private static boolean validateCount(int[] numbers, int count) {
        if (count < 0 || count > numbers.length) {
            System.out.println("Invalid count");
            return true;
        }
        return false;
    }

    private static void fillElementsByCriteria(int[] numbers, int count, int num, int index, String criteria) {
        int[] result = new int[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == num) {
                if (index == result.length) {
                    result = changeArraySize(result);
                }
                result[index++] = numbers[i];
            }
        }

        if (index == 0) {
            System.out.println("[]");
        } else {
            int minCount = Math.min(count, result.length);
            String output = "[";

            if (criteria.equals("first")) {
                for (int i = 0; i < minCount; i++) {
                    if (i < minCount - 1) {
                        output += result[i] + ", ";
                    } else {
                        output += result[i] + "]";
                    }
                }

            } else {
                int countElements = 0;
                for (int i = 0; i < minCount; i++) {
                    if (i < minCount - 1) {
                        output += result[result.length - minCount + countElements++] + ", ";
                    } else {
                        output += result[result.length - minCount + countElements++] + "]";
                    }
                }
            }
            System.out.println(output);
        }
    }


    private static int[] changeArraySize(int[] result) {
        int[] newArray = new int[result.length + 1];

        for (int i = 0; i < result.length; i++) {
            newArray[i] = result[i];
        }

        return newArray;
    }

    private static void minElementIndex(int[] numbers, String command) {
        int num = command.equals("even") ? 0 : 1;

        int maxElement = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == num) {
                if (numbers[i] <= maxElement) {
                    maxElement = numbers[i];
                    index = i;
                }
            }
        }

        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }

    }

    private static void maxElementIndex(int[] numbers, String command) {
        int num = command.equals("even") ? 0 : 1;

        int maxElement = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == num) {
                if (numbers[i] >= maxElement) {
                    maxElement = numbers[i];
                    index = i;
                }
            }
        }

        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }

    }

    private static void exchangeArray(int[] numbers, int index) {
        if (index < 0 || index >= numbers.length) {
            System.out.println("Invalid index");
            return;
        }

        int count = 0;
        int[] result = new int[numbers.length];

        for (int i = index + 1; i < numbers.length; i++) {
            result[count++] = numbers[i];
        }

        for (int i = 0; i <= index; i++) {
            result[count++] = numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = result[i];
        }
    }
}


