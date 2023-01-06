package cardshuffler;

public class card{
    private String faces;
    private String suits;

    public card (String cardface, String cardsuit){
        
    }
    public String toString(){
        return faces + "of" + suits; 
    }
}