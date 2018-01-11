package Chapter4;

import java.util.Scanner;

/**
 * Program to display employees, hours worked, pay rate, gross pay, and others.
 *
 * @author Garrett Boring
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
//scanner
        Scanner input = new Scanner(System.in);
//User interaction and Numbers
        System.out.print("Enter employee's name: ");
        String name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();
        System.out.print("Enter the hourly pay rate dude: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate bruh: ");
        double fedTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate bro: ");
        double stateTax = input.nextDouble();
//variables
        double grossPay = hoursWorked * payRate;
//federal and state withholding values, use those

        double federalw = fedTax * grossPay;
        double statew = stateTax * grossPay;
        double totalID = federalw + statew; //total deduction
        double netPay = grossPay - totalID;
//output
        System.out.printf("\nEmployee name: %s", name);
        System.out.printf("\n Hours worked: %.2f", hoursWorked);
        System.out.printf("\n Pay Rate: $%.2f", payRate);
        System.out.printf("\nGross Pay: $%.2f", grossPay);
        System.out.printf("\nDeductions: ");
        System.out.printf("\nFederal Withholding: $%.2f", federalw);
        System.out.printf("\nState Withholding: $%.2f", statew);
        System.out.printf("\nTotal Deductions: $%.2f", totalID);
        System.out.printf("\nNet Pay: $%.2f", netPay);
    }
}
