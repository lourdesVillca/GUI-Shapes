package org.fundacionjala.org;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by LourdesVillca on 8/24/2016.
 */
public class RectangleTest {
    @Test
    public void test_CalculateArea(){
        Shape shape = new Rectangle(5,6);
        double result = 30;
        assertEquals(result, shape.calculateArea(),0.001);
    }
    @Test
    public void test_CalculatePerimeter(){
        Shape shape = new Rectangle(5,6);
        double result = 60;
        assertEquals(result, shape.calculatePerimeter(),0.001);
    }
}