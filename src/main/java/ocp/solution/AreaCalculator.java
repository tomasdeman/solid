package main.java.ocp.solution;

/**
 * If we need to calculate the area of another shape, we’d have to modify the AreaCalculator class, violating OCP
 */
public class AreaCalculator
{
    public double calculateArea(Shape shape)
    {
        return shape.calculateArea();
    }
}
