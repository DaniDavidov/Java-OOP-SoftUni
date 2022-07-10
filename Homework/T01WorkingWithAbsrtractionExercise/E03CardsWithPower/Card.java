package T01WorkingWithAbsrtractionExercise.E03CardsWithPower;

public class Card {
    private RankPowers rankPower;
    private SuitPowers suitPower;

    public Card(RankPowers rankPower, SuitPowers suitPower) {
        this.rankPower = rankPower;
        this.suitPower = suitPower;
    }

    public RankPowers getRankPower() {
        return rankPower;
    }

    public SuitPowers getSuitPower() {
        return suitPower;
    }
}
