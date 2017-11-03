package cardPackage.cardPairPackage;
import cardPackage.Card;

import java.util.Arrays;

public class TieCardPair extends CardPair{

    public TieCardPair(Card card1, Card card2) {
        super(card1, card2);
    }

    @Override
    public int compareTo(CardPair o) {
        if(Arrays.asList(getScore(), o.getScore()).containsAll(Arrays.asList(Jokbo.광땡, Jokbo.장땡)))
            return -getScore().compareTo(o.getScore());
        else
            return getScore().compareTo(o.getScore());
    }

}
