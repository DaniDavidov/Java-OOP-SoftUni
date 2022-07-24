package T05PolymorphismExercises.E02WildFarm;

public abstract class Vegetarian extends Mammal {

    public Vegetarian(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            super.eat(food);
        } else {
            String message = String.format("%s are not eating that type of food!", this.getAnimalType());
            throw new IllegalArgumentException(message);
        }
    }
}
