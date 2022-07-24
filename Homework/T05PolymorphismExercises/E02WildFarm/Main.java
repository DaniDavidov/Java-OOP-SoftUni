package T05PolymorphismExercises.E02WildFarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line;
        while (!"End".equals(line = scanner.nextLine())) {
            String[] animalData = line.split("\\s+");
            String type = animalData[0];
            String name = animalData[1];
            double weight = Double.parseDouble(animalData[2]);
            String livingRegion = animalData[3];

            Animal animal;
            switch (type) {
                case "Cat":
                    String breed = animalData[4];
                    animal = new Cat(name, type, weight, livingRegion, breed);
                    break;
                case "Tiger":
                    animal = new Tiger(name, type, weight, livingRegion);
                    break;
                case "Mouse":
                    animal = new Mouse(name, type, weight, livingRegion);
                    break;
                case "Zebra":
                    animal = new Zebra(name, type, weight, livingRegion);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid argument");

            }

            String[] foodData = scanner.nextLine().split("\\s+");
            String foodType = foodData[0];
            int quantity = Integer.parseInt(foodData[1]);
            Food food;
            if (foodType.equals("Meat")) {
                food = new Meat(quantity);
            } else {
                food = new Vegetable(quantity);
            }

            animal.makeSound();
            animal.eat(food);
            System.out.println(animal.toString());
        }

    }
}
