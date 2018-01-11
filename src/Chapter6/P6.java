package Chapter6;
import java.util.Scanner;

/**
 * Program to display the amount of money you can get with other money
 * 
 * @author gb1003027
 */
public class P6 {
    
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Add a stop variable for later on in the code :)
        int stop = 0;
        double converting = 0;
        String Asking;
        //Ask for the original conversions
        System.out.print("How many Euros will a Dollar buy? ");
        double eurosperdollar = input.nextDouble();
        System.out.print("How many Pound Sterling will a Dollar buy? ");
        double poundperdollar = input.nextDouble();
        System.out.print("How many Yen will a Dollar buy? ");
        double yenperdollar = input.nextDouble();
        while (stop == 0){
            System.out.print("How many Dollars are you converting my guy?: ");
            double dollars = input.nextDouble();
        System.out.print("Which currency do you want to convert to? (Remember: E for Euros, P for Pounds, or Y for Yen): ");
        String convert = input.next().toUpperCase();
        switch(convert){
            case "E":
                converting = eurosperdollar;
                break;
            case "Y":
                converting = yenperdollar;
                break;
            case "P":
                converting = poundperdollar;
                break;
                
            }
       System.out.printf("The amount from dollars to the selected currency is %.2f \n", Conversion(dollars,converting));
       
       
       do {
           System.out.println("Are there any more conversions you want to do? ");
        Asking = input.next().toUpperCase();
        switch(Asking){
            case "YES":
                break;
            case "NO":
                System.out.println("Okay!Bye Shorty!");
                System.exit(0);
                break;
            default:
                System.out.println("Sorry! I didn't quite get that. Enter either 'yes' or 'no' please! ");
                break;
             }
       }while (!Asking.equals("YES"));
       
       
       }
    }
    public static double Conversion(double d, double c){
        double fee;
        double finalTotal;
        if (d <= 100){
            fee = d * 0.10;
            finalTotal =(d - fee) * c;
        }
        else{
            fee = d * 0.05;
            finalTotal = (d - fee) * c;
                    
        }
        
        
        
        
        
        return finalTotal;
    
    }


    }
