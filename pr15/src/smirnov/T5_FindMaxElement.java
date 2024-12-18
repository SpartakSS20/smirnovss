package smirnov;

public class T5_FindMaxElement {
    public static <E extends Comparable<E>> E findMax(E[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив пуст или равен нулю");
        }

        E max = array[0];
        for (E element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        T5_Circle[] circles = {
                new T5_Circle(1.5),
                new T5_Circle(2.3),
                new T5_Circle(0.9),
                new T5_Circle(3.7)
        };

        T5_Circle maxCircle = findMax(circles);
        System.out.println("Окружность с наибольшим радиусом: " + maxCircle);
    }
}