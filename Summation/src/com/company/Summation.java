package com.company;

public class Summation {
    private int i,j;
    public Summation(int x,int y){
        this.i=x;
        this.j=y;
    }
    int total(int x,int y) {
        int a = 0;
        int sum = x;
        if (y > x) {
            for (int i = 1; i < (y - x) + 1; i++) {

                a = x + i;
                sum = sum + a;
            }
        }
        else {
            for (int i = 1; i < (x - y) + 1; i++) {
                a = x - i;
                sum = sum + a;
            }
        }
        return sum;

    }

}
