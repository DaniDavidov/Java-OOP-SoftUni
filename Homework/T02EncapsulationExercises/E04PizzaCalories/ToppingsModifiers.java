package T02EncapsulationExercises.E04PizzaCalories;

public enum ToppingsModifiers {
    Meat(1.2),
    Veggies(0.8),
    Cheese(1.1),
    Sauce(0.9);

    private double caloriesPerGram;

    ToppingsModifiers(double caloriesPerGram) {
        this.caloriesPerGram = caloriesPerGram;
    }

    public double getCaloriesPerGram() {
        return caloriesPerGram;
    }
}
