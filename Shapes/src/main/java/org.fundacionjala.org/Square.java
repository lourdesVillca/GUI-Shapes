package org.fundacionjala.org;

/**
 * Created by LourdesVillca on 8/24/2016.
 */
public class Square extends Rectangle{

    public Square(int side){
        super(side,side);

    }
    public double calculatePerimeter(){
        return 4*this.getSideA();
    }
}

