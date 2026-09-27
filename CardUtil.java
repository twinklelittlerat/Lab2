public class CardUtil {

    public static final Rank HIGHEST_RANK = Rank.ACE;
    public static final Suit HIGHEST_SUIT = Suit.SPADES;


    public static boolean isHighestCard(Card card) {
    return card.getRank() == HIGHEST_RANK
            && card.getSuit() == HIGHEST_SUIT;
}
}