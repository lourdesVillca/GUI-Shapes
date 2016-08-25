package org.fundacionjala.org;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by LourdesVillca on 8/24/2016.
 */
public class CircleTest {
    @Test
    public void test_CalculateArea(){
        Shape shape = new Circle(5);
        double result = 15.7;
        assertEquals(result, shape.calculateArea(),0.001);

    }
    public void test_CalculatePerimeter(){
        Shape shape = new Circle(5);
        double result = 31.4;
        assertEquals(result, shape.calculatePerimeter(),0.001);

    }

}