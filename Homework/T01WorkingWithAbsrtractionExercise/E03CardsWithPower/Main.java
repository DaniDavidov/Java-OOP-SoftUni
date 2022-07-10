package T01WorkingWithAbsrtractionExercise.E03CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rank = scanner.nextLine();
        String suit = scanner.nextLine();

//        RankPowers rankPower = RankPowers.valueOf(rank);
//        SuitPowers suitPower = SuitPowers.valueOf(suit);

        Card card = new Card(RankPowers.valueOf(rank), SuitPowers.valueOf(suit));
        int totalPower = card.getRankPower().getOrdinalValue() + card.getSuitPower().getOrdinalValue();

        System.out.printf("Card name: %s of %s; Card power: %d", card.getRankPower().name(), card.getSuitPower().name(), totalPower);

    }
}
