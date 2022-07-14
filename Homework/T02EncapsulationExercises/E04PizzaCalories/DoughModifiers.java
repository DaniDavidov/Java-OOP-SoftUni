package T02EncapsulationExercises.E04PizzaCalories;

public enum DoughModifiers {
    White(1.5),
    Wholegrain(1.0),
    Crispy(0.9),
    Chewy(1.1),
    Homemade(1.0);

    private double caloriesPerGram;

    DoughModifiers(double caloriesPerGram) {
        this.caloriesPerGram = caloriesPerGram;
    }

    public double getCaloriesPerGram() {
        return caloriesPerGram;
    }
}
