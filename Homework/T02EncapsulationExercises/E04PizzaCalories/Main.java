package T02EncapsulationExercises.E04PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaData = scanner.nextLine().split("\\s+");
        String pizzaName = pizzaData[1];
        int numberOfToppings = Integer.parseInt(pizzaData[2]);
        Pizza pizza = new Pizza(pizzaName, numberOfToppings);


        String[] doughData = scanner.nextLine().split("\\s+");
        String floutType = doughData[1];
        String bakingTechnique = doughData[2];
        double doughWeight = Double.parseDouble(doughData[3]);
        Dough dough = new Dough(floutType, bakingTechnique, doughWeight);
        pizza.setDough(dough);

        String line;
        while (!"END".equals(line = scanner.nextLine())) {
            String[] toppingData = line.split("\\s+");
            String toppingType = toppingData[1];
            double weight = Double.parseDouble(toppingData[2]);
            Topping topping = new Topping(toppingType, weight);
            pizza.addTopping(topping);
        }

        System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
    }
}
