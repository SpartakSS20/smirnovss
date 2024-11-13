package smirnov_pr10_11;

public class TestGeometricObject {
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(5.5);
        ComparableCircle circle2 = new ComparableCircle(9.0);

        GeometricObject largestCircle = GeometricObject.max(circle1, circle2);
        System.out.println("Наибольший круг: " + largestCircle.getArea());

        Rectangle rectangle1 = new Rectangle(9.0, 4.5);
        Rectangle rectangle2 = new Rectangle(6.0, 4.0);

        GeometricObject largestRectangle = GeometricObject.max(rectangle1, rectangle2);
        System.out.println("Наибольший прямоугольник: " + largestRectangle.getArea());

        ComparableCircle circle3 = new ComparableCircle(3.0); // Площадь = 28.27
        GeometricObject maxShape = GeometricObject.max(circle3, rectangle1);
        if (maxShape instanceof ComparableCircle) {
            System.out.println("Наибольшая фигура - круг с площадью: " + maxShape.getArea());
        } else {
            System.out.println("Наибольшая фигура - прямоугольник с площадью: " + maxShape.getArea());
        }
    }
}
