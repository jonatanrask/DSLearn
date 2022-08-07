package entities.Enums;

import entities.Shape;

public class Circle extends Shape {
    private Double radius;

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area() {
        final double  pi = 3.14;
        return pi * (radius * radius);
    }
}
