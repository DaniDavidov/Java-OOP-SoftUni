package T01WorkingWithAbsrtractionExercise.E01CardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Card Suits:");
        for (Suit value : Suit.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", value.getOrdinalValue(), value.name());
        }

    }
}
