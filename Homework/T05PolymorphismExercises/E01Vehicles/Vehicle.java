package T05PolymorphismExercises.E01Vehicles;

public abstract class Vehicle {
    private double fuelQuantity;
    private double litersPerKilometer;
    private double tankCapacity;

    public Vehicle(double fuelQuantity, double litersPerKilometer, double tankCapacity) {
        this.litersPerKilometer = litersPerKilometer;
        this.tankCapacity = tankCapacity;
        this.fuelQuantity = fuelQuantity;
    }

    public abstract String drive(double kilometers);
    public abstract void refuel(double fuel);

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        if (fuelQuantity < 0) {
            System.out.println("Fuel must be a positive number");
        } else if (fuelQuantity > tankCapacity) {
            System.out.println("Cannot fit fuel in tank");
        } else {
            this.fuelQuantity = fuelQuantity;
        }
    }

    public double getLitersPerKilometer() {
        return litersPerKilometer;
    }

    public void setLitersPerKilometer(double litersPerKilometer) {
        this.litersPerKilometer = litersPerKilometer;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }
}
