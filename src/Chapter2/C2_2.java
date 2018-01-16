package Chapter2;

import java.util.Scanner;

/**
 * Program to display the area and your volume to the console
 *
 * @author Garrett Boring
 *
 */
public class C2_2 {

    /**
     * Main Method
     *
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius and a length: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = radius * radius * 3.14;
        double volume = area * length;
        System.out.println("Your area is " + area + " Your volume is " + volume + "");

    }
}
