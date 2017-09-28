package com.company;

import java.util.Scanner;

public class Main {
    /**
     * the program takes in two integers and they are passed to the constructor then the sum is calculated of
     * the numbers between the two integers are added including the integers
     * the sum is calculated in a method
     * @param args
     */


    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        System.out.println("Enter integer 1");
        int x=abc.nextInt();
        System.out.println("Enter integer 2 ");
        int y=abc.nextInt();
         Summation obj=new Summation(x,y);
         int z=obj.total(x,y);
        System.out.println("the total sum is "+z);
    }
}
