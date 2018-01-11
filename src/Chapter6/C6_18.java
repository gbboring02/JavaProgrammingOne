package Chapter6;
import java.util.Scanner;

/**
 * Program to display if the password is correct or not
 * 
 * @author gb1003027
 */

public class C6_18 {
    
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt 
     */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a Password: ");
        
        String s = input.nextLine();
        
        if (checkPassword(s)) {
            System.out.println("Valid Password");
        }else{
            System.out.println("Invalid Password");
        }
    }
    public static boolean checkPassword(String password) {
       boolean checkPassword = true;
       
       if (password.length() < 8) {
           checkPassword = false;
       }else{
           int numberOfDigit = 0;
           for (int i =0; i < password.length(); i++) {
               if (isDigit(password.charAt(i))
               || isLetter(password.charAt(i))) {
                   if (isDigit(password.charAt(i))) {
                       
                       numberOfDigit++;
                   }
               }else{
                   
                   checkPassword = false;
                   break;
                  }        
                 }
       
                 if (numberOfDigit < 2) {
                     checkPassword = false;
                 }
     
               }
    
               return checkPassword;
               
             }

             public static boolean isLetter(char ch){
                 
                 return ((ch <= 'z' && ch >= 'a')
               || (ch <= 'Z' && ch >= 'A'));
                
                }
             
             public static boolean isDigit(char ch) {
                 return (ch <= '9' && ch >= '0');
             }
}




        
