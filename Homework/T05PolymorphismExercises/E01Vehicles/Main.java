package T05PolymorphismExercises.E01Vehicles;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Vehicle> vehicles = new LinkedHashMap<>();

        String[] carData = scanner.nextLine().split("\\s+");
        Vehicle car = new Car(Double.parseDouble(carData[1]), Double.parseDouble(carData[2]), Double.parseDouble(carData[3]));
        vehicles.put(carData[0], car);

        String[] truckData = scanner.nextLine().split("\\s+");
        Vehicle truck = new Truck(Double.parseDouble(truckData[1]), Double.parseDouble(truckData[2]), Double.parseDouble(truckData[3]));
        vehicles.put(truckData[0], truck);

        String[] busData = scanner.nextLine().split("\\s+");
        Vehicle bus = new Bus(Double.parseDouble(busData[1]), Double.parseDouble(busData[2]), Double.parseDouble(busData[3]));
        vehicles.put(busData[0], bus);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String command = data[0];
            String vehicleType = data[1];

            switch (command) {
                case "Drive":
                    double kilometers = Double.parseDouble(data[2]);
                    Vehicle vehicle = vehicles.get(vehicleType);

                    if (vehicle instanceof Bus) {
                        ((Bus) vehicle).setEmpty(false);
                    }
                    System.out.println(vehicle.drive(kilometers));

                    break;
                case "Refuel":
                    double fuel = Double.parseDouble(data[2]);
                    if (fuel <= 0) {
                        System.out.println("Fuel must be a positive number");
                        continue;
                    }
                    vehicle = vehicles.get(vehicleType);
                    vehicle.refuel(fuel);
                    break;
                case "DriveEmpty":
                    kilometers = Double.parseDouble(data[2]);
                    vehicle = vehicles.get(vehicleType);
                    if (vehicle instanceof Bus) {
                        ((Bus) vehicle).setEmpty(true);
                    }
                    System.out.println(vehicle.drive(kilometers));
                    break;
            }

        }
        vehicles.forEach((typeVehicle, vehicle) -> System.out.printf("%s: %.2f%n", typeVehicle, vehicle.getFuelQuantity()));
    }
}
