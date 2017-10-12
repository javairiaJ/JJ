package com.company;

public class Triangle  {
    private point vertex1;
    private point vertex2;
    private point vertex3;

    public Triangle(point a,point b,point c) {
this.vertex1=a;
this.vertex2=b;
this.vertex3=c;

    }
 public String toString(){
        return "My Triangle [ V1= "+vertex1+" , V2= "+vertex2+" V3= "+vertex3+" ]";
 }
    
    public double getPerimeter(){
        double gh=vertex1.distance(vertex2)+vertex1.distance(vertex3)+vertex2.distance(vertex3);
        return gh;
    }

    public String getType(){
        if(vertex1.distance(vertex2)==vertex1.distance(vertex3)&&vertex1.distance(vertex3)==vertex2.distance(vertex3)&&vertex1.distance(vertex2)==vertex2.distance(vertex3))
         return "EQUILATERAL";
        else if(vertex1.distance(vertex2)==vertex1.distance(vertex3)||vertex1.distance(vertex3)==vertex2.distance(vertex3)||vertex1.distance(vertex2)==vertex2.distance(vertex3))
        return "ISOSCELES";
        else
            return "SCALENE";
    }
}
