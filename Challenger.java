import java.util.Random;
public class Challenger {
    Random random = new Random();

    private String[] hands = {"rock", "paper", "scissors"};
    public String opponent;

    public Challenger(String chosenOpponent) {
        this.opponent = chosenOpponent;
    }

    public String round(int hand) {
        String result = "";
        if (hand == 0 || hand == 1 || hand == 2) { 
            if (opponent == "sponge") {
                int userHand = hand;
                System.out.println();
                System.out.println("You used " + hands[userHand] + "!");
                int challengerHand = random.nextInt(3);

                System.out.println("Spongebob used " + hands[challengerHand] + "!");
                if (userHand == 0 && challengerHand == 2 || userHand == 1 && challengerHand == 0 || userHand == 2 && challengerHand == 1) {
                    result = "You win!";
                } else if (userHand == challengerHand) {
                    result = "It's a tie!";
                } else if (userHand == 2 && challengerHand == 0 || userHand == 0 && challengerHand == 1 || userHand == 1 && challengerHand == 2) {
                    result = "You lose!";
                }
            } else if (opponent == "star") {
                int userHand = hand;
                System.out.println("You used " + hands[userHand] + "!");
                int challengerHand = random.nextInt(3);

                System.out.println("Patrick used " + hands[challengerHand] + "!");
                if (userHand == 0 && challengerHand == 2 || userHand == 1 && challengerHand == 0 || userHand == 2 && challengerHand == 1) {
                    result = "You win!";
                } else if (userHand == challengerHand) {
                    result = "It's a tie!";
                } else if (userHand == 2 && challengerHand == 0 || userHand == 0 && challengerHand == 1 || userHand == 1 && challengerHand == 2) {
                    result = "You lose!";
                }
            }
        } else {
            System.out.println();
            System.out.println("That's not 0, 1 or 2 you dumb nigga");
        }
        return result;
    }
}
