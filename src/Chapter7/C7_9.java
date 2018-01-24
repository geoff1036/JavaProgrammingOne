/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7;

import java.util.Scanner;

/**
 *
 * @author gf0911757
 */
public class C7_9 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        System.out.println("The minimum number is: " + min(numbers));
    }

    public static double min(double[] array) {
        double min = array[0];
        for (double i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
