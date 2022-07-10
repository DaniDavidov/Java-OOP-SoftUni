package T01WorkingWithAbstraction.E04HotelReservation;

public enum Season {
    Autumn(1),
    Spring(2),
    Winter(3),
    Summer(4);

    private int pricePerDayMultiplier;

    Season(int pricePerDayMultiplier) {
        this.pricePerDayMultiplier = pricePerDayMultiplier;
    }

    public int getPricePerDayMultiplier() {
        return pricePerDayMultiplier;
    }
}
