package org.fundacionjala.org;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link Rectangle}
 */
public class RectangleTest {

    private static final double DELTA = 0.001;

    private Shape shape;

    @Before
    public void setUp() {
        final int sideA = 5;
        final int sideB = 6;
        shape = new Rectangle(sideA, sideB);
    }

    @Test
    public void test_CalculateArea() {
        final double result = 30;
        assertEquals(result, shape.calculateArea(), DELTA);
    }

    @Test
    public void test_CalculatePerimeter() {
        final double result = 22;
        assertEquals(result, shape.calculatePerimeter(), DELTA);
    }

}
