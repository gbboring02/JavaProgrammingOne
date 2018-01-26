package Chapter7;

import java.util.Scanner;

/**
 * Program to display ten numbers and the minimum
 * 
 * @author Garrett Boring
 */

public class C7_9 {
    
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        System.out.print("Enter ten numbers: ");
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        System.out.println("The minimum number is: " + min(numbers));
    }

    /**
     * Second method
     * 
     * @param array arguments from command line prompt
     * @return minimum
     */
    
    public static double min(double[] array) {

        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;

    }
}
