package com.company;
/**
 * Constructor creates an object by taking in input of instructionCount, cyclesPerInstruction, cyclesPerSecond
 * It stores the instructionCount in the object's variable directly and computes instructionsPerSecond from the two remaining parameters before also storing it
 *  cyclesPerSecond must be in MHz
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for(;;){
        Scanner abc=new Scanner(System.in);
        CPUtimer obj;
        System.out.println(" Select 1 option out of 3 given :[a,b,c]");
        char ch=abc.next().charAt(0);
        if(ch=='a') {
            System.out.println("Enter instruction count");
            int a = abc.nextInt();
            System.out.println("Cycles per instruction");
            int b = abc.nextInt();
            System.out.println("Speed of clock in MHz");
            int c = abc.nextInt();
            obj = new CPUtimer(a, b, c);
            System.out.println("the seconds per program are " + obj.getSec());
             }
            else if(ch=='b') {
            System.out.println("Enter instruction count");
            int a = abc.nextInt();
            System.out.println("Enter seconds per instruction");
            int b = abc.nextInt();
            obj = new CPUtimer(a, b);
            System.out.println("the seconds per program are " + obj.getSec());
             }
             else if(ch=='c'){
             System.exit(0);

               }
            System.out.println("want to rerun the program  y/n");
             char A=abc.next().charAt(0);
             if(A=='n'){
                 System.exit(0);
             }


            }

        }
    }

