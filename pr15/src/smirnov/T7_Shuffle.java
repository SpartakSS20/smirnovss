package smirnov;

import java.util.ArrayList;
import java.util.Collections;

public class T7_Shuffle {
    public static <E> void shuffle(ArrayList<E> list) {
        Collections.shuffle(list);
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Football");
        words.add("Hockey");
        words.add("Spartak");
        words.add("Ball");
        words.add("Tennis");

        System.out.println("Перед перетасовкой: " + words);
        shuffle(words);
        System.out.println("После перетасовки: " + words);
    }
}