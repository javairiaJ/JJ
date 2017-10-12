package com.company;

public class Main {

    public static void main(String[] args) {
        point P=new point(0,0);
        point P1=new point(0,2);
        point P2=new point(0,3);
        P.distance(P1);
        P.distance(P2);
        P2.distance(P1);
   Triangle T=new Triangle(P,P1,P2);
        System.out.println(T);
        System.out.println("the Perimeter of Triangle is " +T.getPerimeter()+ " and the triangle is "+T.getType());
    }
}
