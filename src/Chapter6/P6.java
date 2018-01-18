
package Chapter6;

import java.util.Scanner;

/**
 * Program applies conversion rates to money
 * 
 * @author Geoffrey Fuller
 */

public class P6 {
    
    /**
    * Main Method
    *
    * @param args arguments from command line prompt
    */
    
     public static void main(String args[]) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How many Euros will a Dollar buy? ");
        double euroDollar = input.nextDouble();
        System.out.print("How many Pound Sterling will a Dollar buy? ");
        double poundDollar = input.nextDouble();
        System.out.print("How many Yen will a Dollar buy? ");
        double yenDollar = input.nextDouble();
        
        String answer = "";
        while (!answer.equalsIgnoreCase("no")) 
        {
            System.out.print("How many dollars are you converting? ");
            double dollars = input.nextDouble();
            
            System.out.println("Enter E for euros, P for pounds, and Y for yen: ");
            String currency = input.next();
            switch (currency) 
            {
                case "E":                   
                    System.out.printf("You bought %.2f Euros\n", exchangeMethod(dollars, euroDollar));
                    break;

                case "P":
                    System.out.printf("You bought %.2f Pounds\n", exchangeMethod(dollars, poundDollar));
                    break;

                case "Y":
                    System.out.printf("You bought %.2f Yen\n", exchangeMethod(dollars, yenDollar));
                    break;
            }
            do 
            {
                System.out.print("Would you like to convert again? ");
                answer = input.next();
            } while (!answer.equalsIgnoreCase("no") && !answer.equalsIgnoreCase("yes"));
        }

    }
/**
 * exchanges the dollars to the specified currency and returns the exchanged amount
 * @param dollars accepts the amount of money the user is inputting
 * @param exchangeRate accepts the appropriate exchange rate to convert the "dollars" variable
 * @return the exchanged "dollars" value
 */
    public static double exchangeMethod(double dollars, double exchangeRate) 
    {
        if (dollars <= 100) 
        {
            return (0.90 * dollars * exchangeRate);
        } else 
        {
            return (0.95 * dollars * exchangeRate);
        }

        
    }
}
