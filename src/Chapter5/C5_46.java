//Geoffrey Fuller
package Chapter5;

import java.util.Scanner;

/**
 * Reverses a user-inputed string
 * @author Geoffrey Fuller
 */

public class C5_46 {
    
    /**
    * Main Method
    *
    * @param args arguments from command line prompt
    */
    
        public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word or phrase:");
        String s = input.nextLine();
        String s2 = "";
        for (int i = s.length() - 1; i >= 0; i--)
        {
            s2 += s.charAt(i);
        }
        System.out.println("The reversed string is " + s2);
    }
}
