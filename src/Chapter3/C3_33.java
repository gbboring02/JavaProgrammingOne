package Chapter3;

import java.util.Scanner;

/**
 * Program to display the weight and price and which is better
 *
 * @author Garrett Boring
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Create Scanner object
//Prompt the user to enter the weight and price of each package
        System.out.print("Enter weight and price of package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        System.out.print("Enter weight and price of package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();
        if (price1 / weight1 < price2 / weight2) {
            System.out.println("Package 1 has a better price.");
        } else if (price1 / weight1 > price2 / weight2) {
            System.out.println("Package 2 has a better price");
        } else {
            System.out.println("Two packages have the same price.");
        }
    }
}
