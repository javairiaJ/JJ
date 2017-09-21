package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner abc= new Scanner(System.in);
        System.out.println("enter the size of Array");
        int x=abc.nextInt();
        Queue obj=new Queue(x);
        System.out.println("insert alphabets to store ");
        for(int i=0;i<x;i++){
            char alp=abc.next().charAt(0);
            System.out.print("storing "+alp);
            obj.put(alp);
        }

        System.out.println("Getting alphabets");
        for(int i=0;i<x+1;i++){
        obj.get();

        }



    }
}
