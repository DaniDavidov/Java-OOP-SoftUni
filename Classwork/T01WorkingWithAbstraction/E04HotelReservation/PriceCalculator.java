package T01WorkingWithAbstraction.E04HotelReservation;

public class PriceCalculator {
    private double pricePerDay;
    private int numberOfDays;

    public static double calculateTotalPrice(double pricePerDay, int numberOfDays,
                                             Season season, DiscountType discountType) {
        double totalPrice = pricePerDay * numberOfDays * season.getPricePerDayMultiplier();
        totalPrice = totalPrice * (100 - discountType.getDiscount()) / 100.0;
        return totalPrice;
    }
}
