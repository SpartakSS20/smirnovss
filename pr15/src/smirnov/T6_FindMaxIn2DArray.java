package smirnov;

public class T6_FindMaxIn2DArray {
    public static <E extends Comparable<E>> E findMax(E[][] array) {
        if (array == null ||  array.length == 0 || array[0].length == 0) {
            throw new IllegalArgumentException("Массив пуст или равен нулю");
        }

        E max = array[0][0];
        for (E[] row : array) {
            for (E element : row) {
                if (element.compareTo(max) > 0) {
                    max = element;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[][] numbers = {
                { 15, 23, 7 },
                { 9, 37, 22 },
                { 12, 18, 29 }
        };

        Integer maxNumber = findMax(numbers);
        System.out.println("Самое большое число - это: " + maxNumber);
    }
}