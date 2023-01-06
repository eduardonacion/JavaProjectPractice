package cardshuffler;

public class Cardshuffler{
public static void main(String[] args) {
    deckcard mydeckcard = new deckcard();

    mydeckcard.shuffle();
   
        for (int i  = 0; i < 13; i++){
            System.out.printf("%-20%-20%-20%-20\n",
            mydeckcard.dealcard(), mydeckcard.dealcard(),mydeckcard.dealcard(), mydeckcard.dealcard());
        }
    
    }
}
 

