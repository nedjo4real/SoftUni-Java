import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Students 2.0
public class Students_2 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        List<Student2> students = new ArrayList<>();

        while (true)
        {
            String line = scan.nextLine();

            if (line.equals("end"))
            {
                break;
            }

            String[] tokens = line.split(" ");

            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String town = tokens[3];

            Student2 currentStudent = new Student2(firstName, lastName, town, age);

            Student2 student = students.stream().filter(x-> x.FirstName.equals(firstName)
                    && x.LastName.equals(lastName)).findFirst().orElse(null);

            if (student == null)
            {
                students.add(currentStudent);
            }
            else
            {
                student.Age = age;
                student.HomeTown = town;
            }
        }

        String input = scan.nextLine();

        for (var student : students)
        {
            if (student.HomeTown.equals(input))
            {
                System.out.printf("%s %s is %d years old%n",student.FirstName,student.LastName,student.Age);
            }
        }
    }
}

class Student2
{
    public String FirstName;
    public String LastName;
    public String HomeTown;
    public int Age;

    public Student2(String firstName, String lastName, String hometown, int age)
    {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.HomeTown = hometown;
        this.Age = age;
    }
}
