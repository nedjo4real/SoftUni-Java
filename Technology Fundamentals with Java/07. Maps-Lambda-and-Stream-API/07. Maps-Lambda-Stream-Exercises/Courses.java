import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
//Courses
public class Courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, List<String>> pairs = new LinkedHashMap<>();

        while (true)
        {
            String line = scan.nextLine();

            if (line.equals("end"))
            {
                break;
            }

            String[] tokens = line.split(" : ");
            String courseName = tokens[0];
            String studentName = tokens[1];

            if (!pairs.containsKey(courseName))
            {
                pairs.put(courseName, new ArrayList<>());
            }

            if (!pairs.get(courseName).contains(studentName))
            {
                pairs.get(courseName).add(studentName);
            }
        }

        pairs.entrySet().stream().sorted((e1,e2) -> {
            int result = Integer.compare(e2.getValue().size(),e1.getValue().size());
            return  result;
        }).forEach(x-> {
            System.out.printf("%s: %d%n",x.getKey(),x.getValue().size());
            x.getValue().stream().sorted().forEach(s-> System.out.println("-- " + s));
        });
    }
}
