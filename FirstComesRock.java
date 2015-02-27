import java.util.Scanner;
public class FirstComesRock {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int mode = 0; //1 means Standard Mode, 2 means Lizard/Spock Mode
        int opponent = 0; //1 is Spongebob, 2 is Patrick
        int hand = 0; //0 is rock, 1 is paper, 2 is scissors
        int maximumRounds = 0; //maximum rounds playable
        int winningRounds = 0; //rounds required to win
        int wonRounds = 0; //number of rounds you win
        int lostRounds = 0; //number of rounds the opponent wins
        int roundCount = 1;
        String temporary = "";

        Challenger sponge = new Challenger("sponge");
        Challenger star = new Challenger("star");

        System.out.println("Welcome to Geoffrey's First Comes Rock");
        System.out.println("How many rounds would you want to win by?");
        try {
            winningRounds = s.nextInt();
        } catch (Exception e) {
        }
        System.out.println();
        if (winningRounds > 0) {
            maximumRounds = winningRounds * 2 - 1;
            System.out.printf("So you want to play for %d out of %d rounds.\n", winningRounds, maximumRounds);
            System.out.println("Would you like to play Standard Mode or Lizard/Spock Mode?");
            System.out.println("Type '1' for Standard Mode");
            System.out.println("Type '2' for Lizard/Spock Mode");
            try {
                mode = s.nextInt();
            } catch (Exception e) {
            }
            System.out.println();
            if (mode == 1) {
                System.out.println("You have chosen Standard Mode.");
                System.out.println("Which opponent do you want to challenge?");
                System.out.println("Type '1' to challenge Spongebob");
                System.out.println("Type '2' to challenge Patrick");
                try {
                    opponent = s.nextInt();
                } catch (Exception e) {
                }
                System.out.println();
                if (opponent == 1) {
                    System.out.println("You have chosen Spongebob.");
                    System.out.println("Spongebob: I'm ready!");
                    System.out.println();
                    do {
                        System.out.printf(" Round %02d%n", roundCount);
                        System.out.println("+--------+");
                        System.out.println("Type '0' for Rock, '1' for Paper, '2' for Scissors");
                        try {
                            temporary = (sponge.round(s.nextInt()));
                        } catch (Exception e) {
                            System.out.println();
                            System.out.println("That's not 0, 1 or 2 you dumb nigga");
                        }
                        if(temporary.equals("You win!")) {
                            roundCount++;
                            wonRounds++;
                            System.out.println("You win!");
                            System.out.println("Won: " + wonRounds + ", Lost: " + lostRounds);
                            System.out.println();
                        } else if (temporary.equals("You lose!")) {
                            roundCount++;
                            lostRounds++;
                            System.out.println("You lose!");
                            System.out.println("Won: " + wonRounds + ", Lost: " + lostRounds);                        
                            System.out.println();
                        } else if (temporary.equals("It's a tie!")) {
                            roundCount++;
                            System.out.println("It's a tie!");
                            System.out.println("Won: " + wonRounds + ", Lost: " + lostRounds);
                            System.out.println();
                        } else {
                            break;
                        }
                    } while (wonRounds < winningRounds && lostRounds < winningRounds);
                    if (wonRounds == winningRounds) {
                        System.out.printf("You won the match %d-%d!\n", wonRounds, lostRounds);
                    }
                    if (lostRounds == winningRounds) {
                        System.out.printf("You lost the match %d-%d!\n", lostRounds, wonRounds);
                    }
                } else if (opponent == 2) {
                    System.out.println("You have chosen Patrick.");
                    System.out.println("Patrick: Oh boy!");
                    System.out.println();
                    do {
                        System.out.printf(" Round %02d%n", roundCount);
                        System.out.println("+--------+");
                        System.out.println("Type '0' for Rock, '1' for Paper, '2' for Scissors");
                        try {
                            temporary = (star.round(s.nextInt()));
                        } catch (Exception e) {
                            System.out.println();
                            System.out.println("That's not 0, 1 or 2 you dumb nigga");
                        }
                        if(temporary.equals("You win!")) {
                            roundCount++;
                            wonRounds++;
                            System.out.println("You win!");
                            System.out.println("Won: " + wonRounds + ", Lost: " + lostRounds);
                            System.out.println();
                        } else if (temporary.equals("You lose!")) {
                            roundCount++;
                            lostRounds++;
                            System.out.println("You lose!");
                            System.out.println("Won: " + wonRounds + ", Lost: " + lostRounds);                        
                            System.out.println();
                        } else if (temporary.equals("It's a tie!")) {
                            roundCount++;                            
                            System.out.println("It's a tie!");
                            System.out.println("Won: " + wonRounds + ", Lost: " + lostRounds);
                            System.out.println();
                        } else {
                            break;
                        }
                    } while (wonRounds < winningRounds && lostRounds < winningRounds);
                    if (wonRounds == winningRounds) {
                        System.out.printf("You won the match %d-%d!\n", wonRounds, lostRounds);
                    }
                    if (lostRounds == winningRounds) {
                        System.out.printf("You lost the match %d-%d!\n", lostRounds, wonRounds);
                    }
                } else {
                    System.out.println("That's not 1 or 2 you dumb nigga"); 
                }
            } else if (mode == 2) {
                //Lizard/Spock mode to be implemented later
            } else {
                System.out.println("That's not 1 or 2 you dumb nigga");
            }
        } else {
            System.out.println("Nigga that doesn't even make sense");
        }
    }
}
