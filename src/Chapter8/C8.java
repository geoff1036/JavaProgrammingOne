
package Chapter8;

import java.util.Scanner;

/**
 *Program takes several input from user to identify a salesman and an amount of 
 * product they sold to log their work
 * @author Geoffrey Fuller
 */
public class C8 {
        /**
    * Main Method
    *
    * @param args arguments from command line prompt
    */
     public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int SalesPerson = 0;
        int day = 0;
        String Answer;
        double sell;
        double[][] sales = new double[4][5];
        boolean Continue = true;

        while(Continue)
        {
            System.out.print("Enter the salesman ID as A, B, C, or D as a capital letter: ");
            Answer = input.next();
            if(Answer.equalsIgnoreCase("A"))
            {
                SalesPerson = 0;
            }
            else if(Answer.equals("B"))
            {
                SalesPerson = 1;
            }
            else if(Answer.equals("C"))
            {
                SalesPerson = 2;
            }
            else if(Answer.equals("D"))
            {
               SalesPerson = 3;
            }
            else
                continue;
            
            System.out.print("Enter the day as M, T, W, H, or F as a capital letter: ");
            Answer = input.next();
            if(Answer.equalsIgnoreCase("M"))
            {
                day = 0;
            }
            else if(Answer.equals("T"))
            {
                day = 1;
            }
            else if(Answer.equals("W"))
            {
                day = 2;
            }
            else if(Answer.equals("H"))
            {
                day = 3;
            }
            else if(Answer.equals("F"))
            {
                day = 4;
            }
            else
                continue;
            
            System.out.print("Enter the amount of the sale: ");
            sell = input.nextDouble();
            
            sales[SalesPerson][day] += sell;
            System.out.println("More data? Enter Y for more or N to stop: ");
            Answer = input.next();
            if(Answer.equalsIgnoreCase("Y"))
                Continue = true;
            else if(Answer.equalsIgnoreCase("N"))
                Continue = false;
        }
        double total = 0;
        for(int x = 0; x < sales.length; ++x)
        {
            for(int y = 0; y < sales[x].length; ++y)
            {
                System.out.print(sales[x][y] + " ");
                total += sales[x][y];
            }
            System.out.println("\n");
        }
        System.out.println("The total sales are " + total);
    }
}
