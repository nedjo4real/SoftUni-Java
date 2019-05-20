import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
//Order by Age
public class Order_by_Age {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        String line = scan.nextLine();

        while (!line.equals("End")) {

            String[] data = line.split(" ");
            String name = data[0];
            String id = data[1];
            int age = Integer.parseInt(data[2]);

            Person person = new Person(name,id,age);

            people.add(person);

            line = scan.nextLine();
        }

        people.stream()
                .sorted(Comparator.comparing(Person::GetAge))
                .forEach(pers ->{
                    System.out.printf("%s with ID: %s is %d years old.%n",pers.Name,pers.ID,pers.Age);
        });

    }
}
class Person
{
    public String Name;
    public String ID;
    public int Age;

    public Person(String name, String ID, int age)
    {
        this.Age = age;
        this.Name = name;
        this.ID = ID;
    }

    public int GetAge(){

        return Age;
    }
}
