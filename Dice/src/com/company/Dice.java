package com.company;

public class Dice {
    int total, value1, value2,N;
    int []arr;

    public Dice(int N) {

        this.N=N;
        arr=new int[N];

    }

    public void roll() {
        Dice obj=new Dice(this.N);
        int []arr=new int[this.N];
        Die D = new Die();
        Die D1 = new Die();
        for(int i=0;i<this.N;i++) {

            System.out.println("rolling ..."+(i+1));

            D.roll();
            D1.roll();
            System.out.println();
            value1 = D.readResult();
            System.out.println("the 1st die gives " + value1);
            value2 = D1.readResult();
            System.out.println("the second die gives " + value2);
            total = value1 + value2;
            obj.arr[i]=total;
            System.out.println("the result is "+total);
            System.out.println();
        }}
void freq(){
        for(int i=2;i<13;i++){
            System.out.println(i+" :");
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==i){
                    System.out.println("*");
                }
            }
        }
}

    int readResult() {

        return total;
    }

    boolean pair() {
        if (value1 == value2)
            return true;
        else
            return false;
    }

    boolean duces() {
        if (value1 == value2){
            if (value1 == 1)
                return true;
    }
        return false;
    }
    boolean sevens(){
        if(total==7)
            return true;
        else
            return false;
    }


    public int[] getArr() {
        return arr;
    }
}

