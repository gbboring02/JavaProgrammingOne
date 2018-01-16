package Chapter5;

import java.util.Scanner;

/**
 * Program to display who won and who lost in the game
 *
 * @author GarrettBoring
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param strings arguments from command line prompt
     */
    public static void main(String[] strings) {
        int compWins = 0;
        int userWins = 0;
        while (userWins <= 2 && compWins <= 2) {
            int computerHand = (int) (Math.random() * 3);
            Scanner input = new Scanner(System.in);
            System.out.print("Enter 0 for scissor, 1 for rock, 2 for paper: ");
            int playerHand = input.nextInt();
            String computer = getHand(computerHand);
            String player = getHand(playerHand);
            String gameStats = getGameStatus(computerHand, playerHand);
            if (gameStats.equals("You won")) {
                userWins++;
            }
            if (gameStats.equals("You lost")) {
                compWins++;
            }
            System.out.println("The computer is" + computer + ".You are" + player + "." + gameStats + ".");
        }
        if (userWins > compWins) {
            System.out.println("You're a winner dude!" + "Dude wins:" + userWins + " Tech Wins: " + compWins);

        } else {
            System.out.println("You're a loser dude!" + "User wins:" + userWins + "Computerwins:" + compWins);
        }
    }

    /**
     * Method that has the objects in it
     *
     * @param hand arguments from command line prompt
     * @return handString
     */
    public static String getHand(int hand) {
        String handString;
        switch (hand) {
            case 0:
                handString = "scissor";
                break;
            case 1:
                handString = "rock";
                break;
            case 2:
                handString = "paper";
                break;
            default:
                handString = null;
        }
        return handString;
    }

    /**
     * Method that shows if you won or lost
     *
     * @param computer arguments from command line prompt
     * @param player arguments from command line prompt
     * @return it's a draw
     */
    public static String getGameStatus(int computer, int player) {
        if (computer == player) {
            return "it's a draw";
        }
        String status = "";
        switch (player) {
            case 0:
                status = (computer != 1) ? "You won" : "You lost";
                break;
            case 1:
                status = (computer != 2) ? "You won" : "You lost";
                break;

            case 2:
                status = (computer != 0) ? "You won" : "You lost";
                break;
        }
        return status;
    }
}
