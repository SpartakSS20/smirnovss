package smirnov;

public class TestSumArea {
    public static void main(String[] args) {

        GeometricObject[] objects = {
                new Circle(3.0),
                new Circle(7.0),
                new Rectangle(3.5, 5.0),
                new Rectangle(6.0, 8.5)
        };

        double totalArea = sumArea(objects);

        System.out.println("Общая площадь всех объектов: " + totalArea);
    }

    public static double sumArea(GeometricObject[] a) {
        double totalArea = 0;
        for (GeometricObject obj : a) {
            totalArea += obj.getArea();
        }
        return totalArea;
    }
}