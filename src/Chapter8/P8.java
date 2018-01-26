package Chapter8;

import java.util.Scanner;

/**
 * Program to display amount of a sale and the day and ID of salesmen
 *
 * @author Garrett Boring
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0;
        do {
            System.out.print("Enter the salesmen ID as A, B, C, or D: ");

            System.out.println("Enter the day as M, T, W, H, or F: ");

            System.out.println("Enter the amount of the sale: ");

            System.out.println("More data? Enter Y for yes and Enter N for no: ");
            String answer = input.next();
            if (answer == "N") {
                counter++;

            }
        } while (counter < 1);

    }
}
