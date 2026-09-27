public class CardUtilTest {

    public static void main(String[] args) {

        Card card1 = new Card(Rank.ACE, Suit.SPADES);
        Card card2 = new Card(Rank.KING, Suit.HEARTS);

        System.out.println(CardUtil.isHighestCard(card1));
        System.out.println(CardUtil.isHighestCard(card2));
    }
}
