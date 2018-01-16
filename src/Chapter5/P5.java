package Chapter5;

import java.util.Scanner;

/**
 * Program to display The results of a vote
 *
 * @author GarrettBoring
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Interaction with the Dude
        System.out.println(" Please enter your vote my dude. ");
        System.out.println("Enter Yes('Y'), No('N'), or to Quit voting enter ('Q')");
        char vote = input.next().charAt(0);

        //Do the counters please
        int totalyes = 0, yes = 1;
        int totalno = 0, no = 1;

        while (vote == 'y' || vote == 'n') {
            if (vote == 'y') {
                totalyes = totalyes + yes;
                yes++;
            }
            if (vote == 'n') {
                totalno = totalno + no;
                no++;
            }

            //End the loop
            if (vote == 'Q') {
                System.out.printf(" Thank you for voting! ");
                System.out.printf("\nThe results are %d for the vote Yes.", totalyes);
                System.out.printf("\nAnd the result are %d for the vote No.", totalno);

            }
        }
    }
}
