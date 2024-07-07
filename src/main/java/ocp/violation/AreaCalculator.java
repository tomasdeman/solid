package main.java.ocp.violation;

/**
 * If we need to calculate the area of another shape, we’d have to modify the AreaCalculator class, violating OCP
 */
public class AreaCalculator
{
    public double calculateRectangleArea(Rectangle r) {
        return r.length * r.width;
    }
}
