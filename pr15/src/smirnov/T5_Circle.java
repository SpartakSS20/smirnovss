package smirnov;

public class T5_Circle implements Comparable<T5_Circle> {
    private double radius;

    public T5_Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public int compareTo(T5_Circle other) {
        return Double.compare(this.radius, other.radius);
    }

    @Override
    public String toString() {
        return "Circle(radius: " + radius + ")";
    }
}