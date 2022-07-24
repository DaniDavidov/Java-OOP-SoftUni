package T05PolymorphismExercises.E01Vehicles;

import java.text.DecimalFormat;

public class Bus extends Vehicle {
    private boolean isEmpty;

    public Bus(double fuelQuantity, double litersPerKilometer, double tankCapacity) {
        super(fuelQuantity, litersPerKilometer, tankCapacity);
        this.isEmpty = true;
    }

    @Override
    public String drive(double kilometers) {
        DecimalFormat pattern = new DecimalFormat("#.##");
        double fuelRequired = this.getLitersPerKilometer() * kilometers;

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
        this.setFuelQuantity(fuel);
    }

    public void setEmpty(boolean empty) {
        if (isEmpty && !empty) {
            isEmpty = false;
            this.setLitersPerKilometer(this.getLitersPerKilometer() + 1.4);
        } else if (!isEmpty && empty) {
            isEmpty = true;
            this.setLitersPerKilometer(this.getLitersPerKilometer() - 1.4);
        }
    }
}
