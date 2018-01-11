package Chapter4;

import java.util.Scanner;

/**
 * Program to display the winners and the bidders and the amounts
 *
 * @author Garrett Boring
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //scanner
        Scanner input = new Scanner(System.in);

        //user interaction
        //do the bidders my boi
        System.out.print("Enter the name of the first bidder: ");
        String bidder1 = input.next();
        System.out.print("Enter the name of the second bidder: ");
        String bidder2 = input.next();

        //work it 
        System.out.print("Enter the number of hours " + bidder1 + " will require: ");
        int hours1 = input.nextInt();
        System.out.print("Enter the number of hours " + bidder2 + " will require: ");
        int hours2 = input.nextInt();

        //Money
        System.out.print("Enter the amount " + bidder1 + " charges per hour: ");
        double money1 = input.nextDouble();
        System.out.print("Enter the amount " + bidder2 + " charges per hour: ");
        double money2 = input.nextDouble();

        //Calculation
        //first bidder
        double cost1 = hours1 * money1;
        //second bidder
        double cost2 = hours2 * money2;

        //cost less
        if (cost1 < cost2) {
            System.out.printf("The winner is %s with a total cost of $%.2f", bidder1, cost1);
        }
        if (cost2 < cost1) {
            System.out.printf("The winner is %s with a total cost of $%.2f", bidder2, cost2);
        }
        //equal hours
        if (cost1 == cost2 && hours1 < hours2) {
            System.out.printf("The winner is %s with a total cost of $%.2f and %d hours", bidder1, cost1, hours1);
        }

        if (cost1 == cost2 && hours1 > hours2) {
            System.out.printf("The winner is %s with a total cost of $%.2f and %d hours", bidder2, cost2, hours2);
        }
        //equal all of everything
        if (cost1 == cost2 && hours1 == hours2) {
            System.out.printf("Both %s and %s have identical bids.", bidder1, bidder2);
            System.out.printf("\nTheir bids were $%.2f", cost1);
            System.out.printf("\nThey're equal in hours, with %s and %s having %d hours.", bidder1, bidder2, hours1);

        }

    }
}
