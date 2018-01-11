package Chapter5;
import java.util.Scanner;

/**
 * Program to display the reversed string to the console
 * 
 * @author gb1003027
 */
public class C5_46 {
    
    /**
     * Main Method
     * 
     * @param strings arguments from command line prompt 
     */
    
public static void main(String[] strings) {
Scanner input = new Scanner(System.in);
//Enter a string
String s = input.nextLine();
System.out.println( "The reversed string is" + new StringBuffer (s) .reverse () .toString() );
}
}