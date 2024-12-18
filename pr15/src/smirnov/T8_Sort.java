package smirnov;

import java.util.ArrayList;
import java.util.Collections;

public class T8_Sort {
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Tennis");
        words.add("Football");
        words.add("Hockey");
        words.add("Spartak");
        words.add("Ball");

        System.out.println("Перед сортировкой: " + words);
        sort(words);
        System.out.println("После сортировки: " + words);
    }
}