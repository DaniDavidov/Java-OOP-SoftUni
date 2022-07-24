package T05PolymorphismExercises.E01Vehicles;

import java.text.DecimalFormat;

public class Truck extends Vehicle {
    private final static double REFUEL_PERCENTAGE = 0.95;

    public Truck(double fuelQuantity, double litersPerKilometer, double tankCapacity) {
        super(fuelQuantity, litersPerKilometer, tankCapacity);
    }

    @Override
    public String drive(double kilometers) {
        DecimalFormat pattern = new DecimalFormat("#.##");
        double fuelRequired = (this.getLitersPerKilometer() + 1.6) * kilometers;

        if (fuelRequired < this.getFuelQuantity()) {
            this.setFuelQuantity(this.getFuelQuantity() - fuelRequired);
            String output = String.format("%s travelled ", getClass().getSimpleName());
            output = output + pattern.format(kilometers) + " km";
            return output;
        }

        return String.format("%s needs refueling", getClass().getSimpleName());
    }

    @Override
    public void refuel(double fuel) {
        double fuelToBeAdded = fuel * REFUEL_PERCENTAGE;
        this.setFuelQuantity(this.getFuelQuantity() + fuelToBeAdded);
    }
}
