package T01WorkingWithAbsrtractionExercise.E01CardSuit;

public enum Suit {
    CLUBS(0),
    DIAMONDS(1),
    HEARTS(2),
    SPADES(3);


    private int ordinalValue;

    Suit(int originalValue) {
        this.ordinalValue = originalValue;
    }

    public int getOrdinalValue() {
        return ordinalValue;
    }

}
