package T04InterfacesAndAbstraction.E01CarShop;

public class Seat extends CarImpl implements Sellable {
    private double price;

    public Seat(String model, String color, int horsePower, String countryProduced, double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(System.lineSeparator());
        sb.append(String.format("%s sells for %f", getModel(), getPrice()));
        return sb.toString();
    }

    @Override
    public double getPrice() {
        return price;
    }
}
