package collection.compare.test;

public class Card implements Comparable<Card> {

    private final int rank;
    private final Suit suit;

    public Card(int cardNumber, Suit suit) {
        this.rank = cardNumber;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }


    @Override
    public int compareTo(Card anotherCard) {
        // 숫자비교 -> 문자비교
        if (this.rank != anotherCard.rank) {
            return Integer.compare(this.rank, anotherCard.rank);
        } else {
            return this.suit.compareTo(anotherCard.suit);
        }
    }

    @Override
    public String toString() {
        return rank + "(" + suit.getIcon() + ")";
    }
}
