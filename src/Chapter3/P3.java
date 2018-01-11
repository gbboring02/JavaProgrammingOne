package Chapter3;

import java.util.Scanner;

/**
 * Program to display if the fraction is right or not
 *
 * @author Garrett Boring
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first digit");
        double number1 = input.nextDouble();
        System.out.print("Enter a second digit");
        double number2 = input.nextDouble();

        if (number1 < number2) {
            System.out.println("The first number is less than the second");
        }
        if (number1 > number2) {
            System.out.println("The first number is greater than the second");
        }
        if (number1 == number2) {
            System.out.println("The first number is equal to the second.");
        }
        if (number1 <= number2) {
            System.out.println("The first number is less than or equal to the second.");
        }
        if (number1 != number2) {
            System.out.println("The first number is not equal to the second.");
        }

        if (number1 == 0) {
            System.out.println("Cannot divide by zero");
        } else if (number1 / number2 < 1) {
            System.out.println("proper fraction");
        } else {
            System.out.println("Improper fraction.");
        }

        if (number1 >= 90) {
            System.out.println("A");
        } else if (number1 >= 80) {
            System.out.println("B");
        } else if (number1 >= 70) {
            System.out.println("C");
        } else if (number1 >= 60) {
            System.out.println("D");
        } else if (number1 >= 50) {
            System.out.println("F");
        }

        if (number2 >= 1) {
            System.out.println("In range");
        } else if (number2 <= 100) {
            System.out.println("In range");
        } else if (number2 > 100) {
            System.out.println("Out of Range");
        } else if (number2 < 1) {
            System.out.println("Out of Range");
        }
    }
}
