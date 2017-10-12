package com.company;

public class Main {

    public static void main(String[] args) {

        undergrad[] UG = new undergrad[5];
        UG[0] = new undergrad("ali", 60);
        UG[1] = new undergrad("umer", 76);
        UG[2] = new undergrad("eva", 50);
        UG[3] = new undergrad("faiz", 80);
        UG[4] = new undergrad("arham", 55);

        System.out.println("Names \t"+"Grade");

         for (int i=0;i<5;i++){

            UG[i].CGrade(UG[i]);
             System.out.println(UG[i].getName()+" \t "+UG[i].getGrade());
         }
    }
}
