package T03InheritanceExercises.E04needForSpeed;

public class Car extends Vehicle {
    public final static double DEFAULT_FUEL_CONSUMPTI0N = 3;

    public Car(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTI0N);
    }

}
