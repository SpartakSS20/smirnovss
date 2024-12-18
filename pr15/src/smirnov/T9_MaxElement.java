package smirnov;

import java.util.ArrayList;

public class T9_MaxElement {
    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Список пуст");
        }

        E max = list.get(0);
        for (E element : list) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(7);
        numbers.add(30);
        numbers.add(15);

        Integer maxNumber = max(numbers);
        System.out.println("Самое большое число - это: " + maxNumber);
    }
}