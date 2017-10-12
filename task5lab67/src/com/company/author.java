package com.company;

public class author {

    private String Name,email;
     public author(String x,String y){
         this.Name=x;
         this.email=y;
     }

    public String getName() {
        return Name;
    }


    public String getEmail() {
        return email;
    }



    public String toString() {
        return "[Author name: "+getName()+"  Email: "+getEmail()+" ]";
    }
}
