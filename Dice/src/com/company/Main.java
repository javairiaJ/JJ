package com.company;

/**
 * the main method  calls the method by making an object of dice calls
 * the method 'roll' performs the rolling of dice and two numbers are obtained and added as the result
 * which is printed when the code executes
 *
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("enter the number of rolls");
        int N = abc.nextInt();
        Dice obj = new Dice(N);
        obj.roll();
        obj.freq();

    }
}








