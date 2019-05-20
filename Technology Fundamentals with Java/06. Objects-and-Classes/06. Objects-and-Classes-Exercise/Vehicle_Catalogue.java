import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Vehicle Catalogue
public class Vehicle_Catalogue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();

        String line = scan.nextLine();

        int carCounter = 0;
        int hpsum = 0;

        while (!line.equals("End")) {

            String[] data = line.split(" ");
            String type = data[0];
            if(type.equals("car") || type.equals("car")){
                type = "Car";
            }else{
                type = "Truck";
            }
            String model = data[1];

            String color = data[2];
            int hp = Integer.parseInt(data[3]);

            Car car = new Car(type, model, color, hp);

            cars.add(car);

            line = scan.nextLine();
        }

        while (true) {
            String modell = scan.nextLine();

            if (modell.equals("Close the Catalogue")) {
                break;
            }

            Car currentVehicle = cars.stream().filter(x -> x.model.equals(modell)).findFirst().orElse(null);

            System.out.printf("Type: %s%n", currentVehicle.type);
            System.out.printf("Model: %s%n", currentVehicle.model);
            System.out.printf("Color: %s%n", currentVehicle.color);
            System.out.printf("Horsepower: %s%n", currentVehicle.hp);
        }

        double truckTotalHorsepower = 0;
        double totalTrucks = 0;
        double carTotalHorsepower = 0;
        double totalCars = 0;

        for (Car carr : cars) {
            if (carr.type.equals("Truck")||carr.type.equals("truck")) {
                totalTrucks++;
                truckTotalHorsepower += carr.hp;
            } else {
                totalCars++;
                carTotalHorsepower += carr.hp;
            }
        }

        double averageTruckHorsepower = 0;
        double averageCarHorsepower = 0;

        if (truckTotalHorsepower != 0) {
            averageTruckHorsepower = truckTotalHorsepower / totalTrucks;
        }

        if (carTotalHorsepower != 0) {
            averageCarHorsepower = carTotalHorsepower / totalCars;
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarHorsepower);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageTruckHorsepower);
    }
}

class Car{
    public String type;
    public String model;
    public String color;
    public int hp;

    public Car(String type, String model, String color, int hp){
        this.type = type;
        this.model = model;
        this.color = color;
        this.hp = hp;
    }
}
