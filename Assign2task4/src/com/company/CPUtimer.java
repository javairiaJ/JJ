package com.company;

public class CPUtimer {

    private int IC;
    private Double IperSec;

    public CPUtimer(int Ic, int cyclesPERins, int cyclesPERsec){
        this.IC=Ic;
        this.IperSec=(double)cyclesPERsec*1000000;
        IperSec=IperSec/cyclesPERins;
    }

    public CPUtimer(int iC,int InsPerSec){
        this.IC=iC;
        this.IperSec=(double)InsPerSec;
    }

    // returns the instruction count as stored in the object
    int getIC(){
        return IC;
    }
    // returns the  instruction per sec
    double getSPI(){
        double x=1/IperSec;
       return x;
    }

    // returns the seconds per program
    double getSec(){

        return IC*getSPI();
    }

}

