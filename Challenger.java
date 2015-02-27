import java.util.Random;
public class Challenger {
    Random random = new Random();

    private String[] hands = {"rock", "paper", "scissors"};
    public String opponent;
    private int challengerHand = random.nextInt(3);

    public Challenger(String chosenOpponent) {
        this.opponent = chosenOpponent;
    }
    
    public String round(int hand) {
        String result = "";
        if (opponent == "sponge") {
            int userHand = hand;
            System.out.println("You used " + hands[userHand] + "!");
            System.out.println("Spongebob used " + hands[challengerHand] + "!");
            if (userHand == 0 && challengerHand == 2 || userHand > challengerHand) {
                result = "You win!";
            } else if (userHand == challengerHand) {
                result = "It's a tie!";
            } else {
                result = "You lose!";
            }
        } else if (opponent == "star") {
            
        }
        return result;
    }
}
