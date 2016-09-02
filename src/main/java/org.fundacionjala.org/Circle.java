package org.fundacionjala.org;

/**
 * Calculates the perimeter and area for a Circle.
 */
public class Circle implements Shape {

    private final int radio;

    /**
     * Constructor.
     *
     * @param radio of the circle.
     */
    public Circle(int radio) {
        this.radio = radio;
    }

    /**
     * {@inheritDoc}
     */
    public double calculateArea() {
        return radio * radio * Math.PI;
    }

    /**
     * {@inheritDoc}
     */
    public double calculatePerimeter() {
        return 2 * radio * Math.PI;
    }

}
