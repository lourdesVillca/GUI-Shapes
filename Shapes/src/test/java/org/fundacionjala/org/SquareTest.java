package org.fundacionjala.org;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by LourdesVillca on 8/24/2016.
 */
public class SquareTest {
    @Test
    public void test_CalculateArea(){
        Shape shape = new Square(5,5);
        double result = 25;
        assertEquals(result, shape.calculateArea(),0.001);
    }
    @Test
    public void test_CalculatePerimeter(){
        Shape shape = new Square(5,5);
        double result = 20;
        assertEquals(result, shape.calculatePerimeter(),0.001);
    }
}