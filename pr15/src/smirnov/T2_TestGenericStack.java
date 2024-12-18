package smirnov;

import java.util.Scanner;

public class T2_TestGenericStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        T2_GenericStack<String> stack = new T2_GenericStack<>();

        System.out.println("Введите пять строк:");

        for (int i = 0; i < 5; i++) {
            stack.push(scanner.nextLine());
        }

        System.out.println("Строки в обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        scanner.close();
    }
}