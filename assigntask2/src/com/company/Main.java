package com.company;
/**
 * the program takes in two integers and they are passed to the constructor then the multiplication is done of
 * the numbers between the two integers and the integers are also multiplied in process
 * the multiplication is calculated in a method total
 * @param args
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        System.out.println("Enter integer 1");
        int x=abc.nextInt();
        System.out.println("Enter integer 2 ");
        int y=abc.nextInt();
        Multiplication obj=new Multiplication(x,y);
        int z=obj.total(x,y);
        System.out.println("the total sum is "+z);
    }
}
