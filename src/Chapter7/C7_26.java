package Chapter7;

import java.util.Scanner;

/**
 * Program to display whether the lists are the same or not.
 *
 * @author Garrett Boring
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list 1... ");
        int[] L1 = new int[input.nextInt()];
        for (int i = 0; i < L1.length; i++) {
            L1[i] = input.nextInt();
        }
        System.out.print("Enter list 2... ");
        int[] L2 = new int[input.nextInt()];
        for (int i = 0; i < L2.length; i++) {
            L2[i] = input.nextInt();
        }
        if (equals(L1, L2)) {
            System.out.println("The lists are identical");
        } else {
            System.out.println("The lists are not identical");
        }
    }

    /**
     * Second Method
     *
     * @param list1 is a list of numbers and you see if it is identical to the
     * other list
     * @param list2 is a list of numbers and you see if it is identical to the
     * other list
     * @return true
     */
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }
}
