package com.company;

public class book {
    private String title;
    private author ath;
    private double price;

    public book(String T,double P,author at){
        this.title=T;
        this.price=P;
        this.ath=at;
    }

    public String getTitle() {
        return title;
    }

    public author getAth() {
        return ath;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return " Book [ name: "+getTitle()+"  price: "+getPrice()+" "+getAth()+" ]";
    }
}
