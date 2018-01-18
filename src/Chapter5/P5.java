//Geoffrey Fuller
package Chapter5;

import java.util.Scanner;

/**
 * Program allows user to vote
 * @author Geoffrey Fuller
 */

public class P5 {

    /**
    * Main Method
    *
    * @param args arguments from command line prompt
    */
    
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Y for yes, an N for no, or a Q to quit voting: ");
        String vote = input.nextLine().toUpperCase();

        int countY = 0;
        int countN = 0;
        int countI = 0;
        int total = 0;

        while (!vote.equalsIgnoreCase("Q")) {
            
            switch (vote) {
                case "Y":
                    countY++;
                    break;

                case "N":
                    countN++;
                    break;

                default:
                    System.out.println("INVALID CODE: Enter 'Y' to vote yes, 'N' to vote no, or 'Q' to quit voting.");
                    countI++;
                    break;
            }
            System.out.println("Enter a Y for yes, an N for no, or a Q to quit voting: ");
            vote = input.nextLine().toUpperCase();

        }

        System.out.println("Yes votes: " + countY);
        System.out.println("No votes: " + countN);
        System.out.println("Invalid votes: " + countI);
        System.out.println("Total votes: " + (countY + countN + countI));
        System.exit(0);
    }
}
