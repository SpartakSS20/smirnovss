package smirnov_task_5;
public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getRadius() {
        return radius;
    }
    public static void main(String[] args) {
        Circle[] circles = {
                new Circle(4.0),
                new Circle(2.5),
                new Circle(4.5),
                new Circle(5.2),
                new Circle(6.0)
        };
        int largestCircleIndex = 0;
        for (int i = 1; i < circles.length; i++) {
            if (circles[i].getArea() > circles[largestCircleIndex].getArea()) {
                largestCircleIndex = i;
            }
        }
        System.out.println("Круг с самой большой площадью: " + (largestCircleIndex + 1));
    }
}