package T05PolymorphismExercises.E02WildFarm;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private String breed;

    public Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public String toString() {
        DecimalFormat pattern = new DecimalFormat("##.##");
        String output = String.format("%s[%s, %s, ", getAnimalType(), getAnimalName(), getBreed());
        output = output.concat(pattern.format(getAnimalWeight()));
        output = output.concat(String.format(", %s, %d]", getLivingRegion(), getFoodEaten()));
        return output;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        this.setFoodEaten(this.getFoodEaten() + food.getQuantity());
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
