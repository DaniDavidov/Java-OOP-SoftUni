package T05PolymorphismExercises.E02WildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;

    public Mammal(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat pattern = new DecimalFormat("##.##");
        String output = String.format("%s[%s, ", getAnimalType(), getAnimalName());
        output = output.concat(pattern.format(getAnimalWeight()));
        output = output.concat(String.format(", %s, %d]", getLivingRegion(), getFoodEaten()));
        return output;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    public void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }
}
