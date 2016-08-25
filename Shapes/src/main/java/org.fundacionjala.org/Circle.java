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

        return radio*PI;
    }
    public double calculatePerimeter(){
        return 2*radio*PI;
    }
}
