package org.fundacionjala.org;


/**
 * Created by LourdesVillca on 8/24/2016.
 */
public class Circle extends Shape{
    private int radio;
    private static final double PI = 3.14;

    public Circle(int radio){
        this.radio = radio;
    }
    public double calculateArea(){
        System.out.println("Circle area: "+radio*PI);
        return radio*PI;
    }
    public double calculatePerimeter(){
        System.out.println("Perimeter: "+2*radio*PI);
        return 2*radio*PI;
    }
}
