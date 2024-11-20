package smirnov;

public class TestGeometricObject_task4_5 {
    public static void main(String[] args) {

        GeometricObject geoObject1 = new Circle(2);
        GeometricObject geoObject2 = new Rectangle(8, 3);

        System.out.println("Одинаковая ли площадь у двух фигур? " +
                equalArea(geoObject1, geoObject2));

        displayGeometricObject(geoObject1);

        displayGeometricObject(geoObject2);
    }

    public static boolean equalArea(GeometricObject object1,
                                    GeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }

    public static void displayGeometricObject(GeometricObject object) {
        System.out.println();
        System.out.println("Площадь равна " + object.getArea());
        System.out.println("Периметр равен " + object.getPerimeter());
    }

}