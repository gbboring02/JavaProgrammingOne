package Chapter2;

import java.util.Scanner;

/**
 * Program to display the gratuity and the total to the console
 *
 * @author Garrett Boring
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Subtotal");
        double Subtotal = input.nextDouble();
        System.out.println("Enter a gratuity rate");
        double GratuityRate = input.nextDouble();
        double GratuityAmount = (GratuityRate / 100) * Subtotal;
//Compute GratuityAmount
        double Total = GratuityAmount + Subtotal;
//Show the results my dude
        System.out.println("The gratuity" + " is " + GratuityAmount);
        System.out.println("The total" + " is " + Total);

    }
}
