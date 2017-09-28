package com.company;
/**
 * the program takes in a number in x and calculates the expression (1*1)% x and prints the answers through a table
 * the calculation of experssion takes place in the tosrting method which is iterated in nested for loop
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        System.out.println("Enter number for table ");
        int x=abc.nextInt();
      ModulusTable obj=new ModulusTable(x,12);
        System.out.println("  "+"1"+" "+"2"+" "+"3"+" "+"4"+" "+"5"+" "+"6"+" "+"7"+" "+"8"+" "+"9"+" "+"10"+" "+"11"+" "+"12");
     for(int j=1;j<13;j++){
         System.out.print(j+" ");
      for(int i=1;i<13;i++){

          System.out.print(obj.toString(i,x,j)+" ");
      }
         System.out.println();
    }
}}
