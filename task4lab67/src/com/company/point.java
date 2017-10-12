package com.company;

public class point {
    private int x,y;


   public point(int x,int y){
       this.x=x;
       this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {

       return y;
    }

    public double distance(point a){
      double b= Math.sqrt(Math.pow(a.x-x,2)+Math.pow(a.y-y,2));
      return b;

    }


    public String toString() {
        return "("+x+","+y+")";
    }
}
