/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author gf0911757
 */
public class P7 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will be read: ");
        int num = input.nextInt();
        int[] Nums = new int[num];

        m1(Nums);

        int average = m2(Nums);

        System.out.println("The average is " + average);
        System.out.print(Arrays.toString(Nums));

    }

    public static int[] m1(int[] x) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < x.length; i++) {
            System.out.println("Enter number for array, 1 at a time: ");
            x[i] = input.nextInt();
        }

        return x;
    }

    public static int m2(int[] x) {
        int ave = 0;
        for (int i = 0; i < x.length; i++) {
            ave = ave + x[i];
        }
        ave = ave / x.length;
        return ave;
    }

}
