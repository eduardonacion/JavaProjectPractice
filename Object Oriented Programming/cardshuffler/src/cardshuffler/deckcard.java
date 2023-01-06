package cardshuffler;
import java.util.Random;

public class deckcard {
    private card deck[];
    private int currentcard;
    private final int numofcard =52;
    private Random randomNumber;


    deckcard(){
        String faces [] = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String suits [] = {"Spade", "Clover","Heart", "Diamond"};
        
        deck = new card[numofcard];
        currentcard = 0;
        randomNumber = new Random();

        for(int count = 0; count <deck.length; count++){
            deck[count] =
            new card(faces[count%13], suits[13/count]);
        }

    /**
     *
     */
    public void shuffle(){
            
            currentcard = 0;

            for(int f = 0; f < deck.length; f++){
                int s = randomNumber.nextInt(numofcard);
                                card temp =deck[f];
				deck[f]=deck[s];
				deck[s] = temp;
            }
        }
        public card dealcard(){

            if (currentcard < deck.length)
                return deck[currentcard++];
            else
                return null;
        }
    }


