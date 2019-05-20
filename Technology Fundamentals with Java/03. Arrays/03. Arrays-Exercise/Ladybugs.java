import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//*LadyBugs
public class Ladybugs {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int fieldSize = Integer.parseInt(reader.readLine());
        String[] indexes = reader.readLine().split(" ");
        int[] field = new int[fieldSize];

        for (int i = 0; i < indexes.length; i++) {
            int index = Integer.parseInt(indexes[i]);
            if (index >= 0 && index < fieldSize) {
                field[index] = 1;
            }
        }
        String command = reader.readLine();

        while (!command.equals("end")) {
            String[] cmdArgs = command.split(" ");
            int index = Integer.parseInt(cmdArgs[0]);
            String cmd = cmdArgs[1];
            int flyLength = Integer.parseInt(cmdArgs[2]);

            if (index < 0 || index > fieldSize - 1 || field[index] == 0) {
                command = reader.readLine();
                continue;
            }
            field[index] = 0;
            if (cmd.equals("right")) {
                index += flyLength;

                while (index < fieldSize && field[index] == 1) {
                    index += flyLength;
                }
                if (index < fieldSize) {
                    field[index] = 1;
                }
            } else {
                index -= flyLength;
                while (index >= 0 && field[index] == 1) {
                    index -= flyLength;
                }
                if (index >= 0) {
                    field[index] = 1;
                }
            }

            command = reader.readLine();

        }

        for (int i = 0; i < field.length; i++) {
            System.out.print(field[i] + " ");

        }
        System.out.println();
    }
}

