//Geoffrey Fuller
package Chapter6;

import java.util.Scanner;

/**
 * Program accepts a password and compares it to several criteria
 * 
 * @author Geoffrey Fuller
 */

public class C6_18 {
    
    
    /**
    * Main Method
    *
    * @param args arguments from command line prompt
    */
    
        public static void main (String[] args)
        {
        Scanner input = new Scanner(System.in);	
		System.out.print("Enter a password: ");
		String password = input.nextLine();
		System.out.println(
			(isValidPassword(password) ? "Valid " : "Invalid ") + "Password");
	}
        /**
        * receives the returns from all the other methods and returns whether or not the password is valid
        * @param password recieves the input password from the user to be checked
        * @return whether or not the password is valid, through "validPassword"
    */
	public static boolean isValidPassword(String password)
        {
		final int validLength = 8;	
	   final int minDigits = 2;	
		boolean validPassword = 
			isLengthValid(password, validLength) && 
			isOnlyLettersAndDigits(password) &&
			hasNDigits(password, minDigits);

		return validPassword;
	}
        /**
         * checks the length of the password
         * @param password receives the string that the user input as password
         * @param validLength decides whether password is
         * too short or is long enough
         * @return true or false as pertaining to the password being long enough
         */
         
	public static boolean isLengthValid(String password, int validLength)
        {
		return password.length() >= validLength;
	}
        /**
         * checks the character makeup of the password
         * @param password receives the user's password 
         * and decides what type of characters make up the password, preferring 
         * letters and digits
         * @return 
         */
	public static boolean isOnlyLettersAndDigits(String password)
        {
		for (int i = 0; i < password.length(); i++)
                {
			if (!Character.isLetterOrDigit(password.charAt(i)))
                        {
                        return false;
			}
		}
		return true;
	}
        /**
         * checks the amount of numbers in the password
         * @param password receives the user's password
         * @param n is used to decide if there are enough digits in the password
         * @return true or false as whether or
         */
	public static boolean hasNDigits(String password, int n)
        {
		int numberOfDigits = 0;
		for (int i = 0; i < password.length(); i++)
                {
			if (Character.isDigit(password.charAt(i)))
                        {
				numberOfDigits++;
			}
			if (numberOfDigits >= n)
                        {
				return true;
			}
		}
		return false;
    }

}
