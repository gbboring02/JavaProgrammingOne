package Chapter4;

import java.util.Scanner;

/**
 * Program to display what grade and what subject they are in
 *
 * @author Garrett Boring
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
//Scanner
        Scanner input = new Scanner(System.in);
//User interaction
        System.out.print("Enter two characters: ");
        String a = input.next().toUpperCase();
        char b = a.charAt(0);
        char c = a.charAt(1);
//calculation
//status
        switch (b) {
            case 'M':
                System.out.println("Mathematics");
                break;
            case 'C':
                System.out.println("Computer Science");
                break;
            case 'I':
                System.out.println("Information Technology");
                break;
            default:
                System.out.println("Please only enter the characters 'M', 'C', or 'I' ");
        }
//major
        switch (c) {
            case '1':

                System.out.println("Freshman");
                break;
            case '2':
                System.out.println("Sophomore");
                break;
            case '3':
                System.out.println("Junior");
                break;
            case '4':
                System.out.println("Senior");
            default:
                System.out.println("Only enter numbers 1 - 4");
        }
    }
}
