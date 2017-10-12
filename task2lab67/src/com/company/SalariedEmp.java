package com.company;

public class SalariedEmp extends Employee {
    private double WSalary,r;


    public SalariedEmp(String x,String y,Double z){
        super(x,y);
        this.WSalary=z;

    }


    public double Earnings(double WSalary,int y){
          WSalary=WSalary*52;
        return WSalary;
    }
    public double getWSalary(){
        return WSalary;
    }

    public void Displaydetails(SalariedEmp c){
        System.out.println(" Name "+this.getName()+" NIC "+this.getNIC()+"Earnings "+this.getWSalary());

    }

}

