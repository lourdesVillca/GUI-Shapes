package org.fundacionjala.org;

/**
 * Created by LourdesVillca on 8/24/2016.
 */
public class Rectangle extends Shape{

    private int sideA;
    private int sideB;
    public Rectangle(int sideA, int sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public double calculateArea(){
        return sideA*sideB;
    }
    public double calculatePerimeter(){
        return 2*sideA*sideB;
    }
    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

}
