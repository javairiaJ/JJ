package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);

        String name, NIC;
        double WSalary, Wage;
        int hours;
        Employee[] arr =new Employee[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Chose one \n a)SalariedEmployee b)HourlyEmployee");
            char E = abc.next().charAt(0);
            if (E == 'a') {
                System.out.println("Enter name NIC and WeeklySalary ");
                name = abc.next();
                NIC = abc.next();
                WSalary = abc.nextDouble();

                arr[i] = new SalariedEmp(name, NIC, WSalary);
                arr[i].Earnings(WSalary,52);
                arr[i].Displaydetails((SalariedEmp) arr[i]);

            }
            else if (E == 'b') {
                System.out.println("Enter name NIC and WeeklySalary and hours");
                name = abc.next();
                NIC = abc.next();
                Wage = abc.nextDouble();
                hours = abc.nextInt();
                arr[i] = new HourlyEmployee(name, NIC, Wage, hours);
                arr[i].Earnings(Wage,hours);
                arr[i].Displaydetails((HourlyEmployee)arr[i]);

            }
        }
    }}

