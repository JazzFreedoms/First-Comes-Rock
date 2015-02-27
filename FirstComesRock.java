import java.util.Scanner;
public class FirstComesRock {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int mode = 0;
        int opponent = 0;
        int hand = 0;

        Challenger sponge = new Challenger("sponge");
        Challenger star = new Challenger("star");

        System.out.println("Welcome to Geoffrey's First Comes Rock");
        //System.out.println("Would you like to play Standard Mode or Lizard/Spock Mode?");
        System.out.println("Type '1' for Standard Mode");
        //System.out.println("Type '2' for Lizard/Spock Mode");
        mode = s.nextInt();
        if (mode == 1) {
            System.out.println("You have chosen Standard Mode.");
            System.out.println("Which opponent do you want to challenge?");
            System.out.println("Type '1' to challenge Spongebob");
            //System.out.println("Type '2' to challenge Patrick");
            opponent = s.nextInt();
                if (opponent == 1) {
                    System.out.println("You have chosen Spongebob.");
                    System.out.println("Spongebob: I'm ready!");
                    System.out.println("Type '0' for Rock, '1' for Paper, '2' for Scissors");
                    System.out.println(sponge.round(s.nextInt()));
                //} else if (opponent == 2) {
                    //System.out.println("You have chosen Patrick.");
                    //System.out.println("Patrick: Oh boy!");
                    //System.out.println("Type '0' for Rock, '1' for Paper, '2' for Scissors");
                } else {
                    System.out.println("Nigga you had ONE JOB"); 
                }
        //} else if (mode == 2) {
            
        } else {
            System.out.println("Nigga you had ONE JOB");
        }
    }
}
