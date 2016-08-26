package org.fundacionjala.org;

/**
 * Calculates the perimeter and area for a Rectangle
 */
public class Rectangle implements Shape {

    protected final int sideA;

    protected final int sideB;

    /**
     * Constructor.
     *
     * @param sideA of the rectangle.
     * @param sideB of the rectangle.
     */
    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    /**
     * {@inheritDoc}
     */
    public double calculateArea() {
        return sideA * sideB;
    }

    /**
     * {@inheritDoc}
     */
    public double calculatePerimeter() {
        return 2 * (sideA + sideB);
    }

}
