package week06_Java_FinalProject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();
    public Deck() {

        List<String> suits = List.of("Hearts","Spades","Diamonds","Clubs");
        List<String> ranks = List.of("2","3","4","5","6","7","8","9","10","11 Jack",
                "12 Queen","13 King","14 Ace");
        for(int i = 0; i< suits.size();i++){
            for(int z = 0; z< ranks.size();z++){
                String cardInfo = ranks.get(z) + " of" + suits.get(i);
                  Card card = new Card(z,cardInfo);
                 cards.add(card);
                 
            }

        }

    }


    public void shuffle(){
        Collections.shuffle(cards);
    }

    public Card draw()
    {
        return cards.remove(cards.size()-1);
    }


}
