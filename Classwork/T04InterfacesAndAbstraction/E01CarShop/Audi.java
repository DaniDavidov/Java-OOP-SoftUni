package T04InterfacesAndAbstraction.E01CarShop;

public class Audi extends CarImpl implements Rentable {
    private int minRentDay;
    private double pricePerDay;

    public Audi(String model, String color, int horsePower, String countryProduced, int minRentDay, double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(System.lineSeparator());
        sb.append(String.format("Minimum rental period of %s days. Price per day %f", minRentDay, pricePerDay));
        return sb.toString();
    }

    @Override
    public int getMinRentDay() {
        return minRentDay;
    }

    @Override
    public double getPricePerDay() {
        return pricePerDay;
    }
}
