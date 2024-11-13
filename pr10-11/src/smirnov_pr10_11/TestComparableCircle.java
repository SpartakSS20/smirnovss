package smirnov_pr10_11;

public class TestComparableCircle {
    public static void main(String[] args) {
        ComparableCircle comparableCircle1 = new ComparableCircle(4.0);
        ComparableCircle comparableCircle2 = new ComparableCircle(6.2);

        GeometricObject largestComparableCircle = GeometricObject.max(comparableCircle1, comparableCircle2);
        System.out.println("Наибольший из двух кругов ComparableCircle: " + largestComparableCircle.getArea());

        ComparableCircle circle = new ComparableCircle(7.0);
        Rectangle rectangle = new Rectangle(6.0, 9.0);

        GeometricObject largestShape = GeometricObject.max(circle, rectangle);
        System.out.println("Наибольший объект между кругом и прямоугольником: " + largestShape.getArea());
    }
}