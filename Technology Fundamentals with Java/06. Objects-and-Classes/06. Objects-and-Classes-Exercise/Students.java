package objects_and_classes.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Students
public class Students {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        List<Student> students = new ArrayList<>();

        while (n!=0) {

            String line = scan.nextLine();
            String[] tokens = line.split("\\s+");

            String firstName = tokens[0];
            String lastName = tokens[1];
            double grade = Double.parseDouble(tokens[2]);

            Student person = new Student(firstName, lastName, grade);

            students.add(person);
            n--;
        }

        students.stream().sorted((e1, e2) -> Double.compare(e2.Grade, e1.Grade)).forEach(x -> {

            System.out.printf("%s %s: %.2f%n", x.FirstName, x.LastName, x.Grade);
        });

    }
}

class Student {
    public String FirstName;
    public String LastName;
    public double Grade;

    public Student(String firstName, String lastName, double grade) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Grade = grade;
    }
}
