package T02EncapsulationExercises.E04PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        this.setName(name);
        this.setToppings(numberOfToppings);
    }

    private void setName(String name) {
        if (name.trim().isEmpty() || name.length() < 1 || name.length() > 15 ) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    private void setToppings(int count) {
        if (count < 0 || count > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.toppings = new ArrayList<>(2);
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return name;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public double getOverallCalories() {
        double doughCalories = this.dough.calculateCalories();
        double toppingsCalories = this.toppings.stream().mapToDouble(Topping::calculateCalories).sum();

        return doughCalories + toppingsCalories;
    }
}
