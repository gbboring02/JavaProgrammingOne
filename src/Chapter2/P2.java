package Chapter2;

import java.util.Scanner;

/**
 * Program to display Price of meal, drink, dessert, tax, tip and final total.
 *
 * @author Garrett Boring
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //Ask the user for the price of the meal
        Scanner input = new Scanner(System.in);
        double Meal, Dessert, Drink, Total, Tax, Tip, TotalTotal;

        System.out.println("Enter the price of the meal");
        Meal = input.nextDouble();

        System.out.println("Price of Drink");
        Drink = input.nextDouble();

        System.out.println("Price of Dessert");
        Dessert = input.nextDouble();

        Total = Meal + Drink + Dessert;
        Tax = Total * .10;
        Tip = (Total + Tax) * .15;
        TotalTotal = Total + Tax + Tip;
        System.out.println(" Total of your food " + Total + " Tax Total " + Tax + " Tip Total " + Tip + " Entire Total " + TotalTotal);

    }
}
