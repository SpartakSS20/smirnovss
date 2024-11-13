package smirnov_pr10_11;

public class TestColorable {
    public static void main(String[] args) {
        GeometricObject[] objects = {
                new Circle(7.0),
                new Rectangle(6.0, 9.0),
                new Square(5.5),
                new ComparableRectangle(7.5, 8.0),
                new Square(7.0)
        };

        for (GeometricObject obj : objects) {
            System.out.println(obj); // Вывод информации об объекте
            System.out.println("Площадь: " + obj.getArea());

            if (obj instanceof Colorable) {
                ((Colorable) obj).howToColor();
            }
            System.out.println();
        }
    }
}