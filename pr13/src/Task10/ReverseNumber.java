package Task10;

import java.util.Scanner;

public class ReverseNumber {
    public static int reverseNumber(int n, int reversed) {
        if (n == 0) {
            return reversed; // Базовый случай: если n равно 0, возвращаем перевернутое число
        }
        // Извлекаем последнюю цифру и добавляем её к результату
        reversed = reversed * 10 + n % 10;
        return reverseNumber(n / 10, reversed); // Убираем последнюю цифру из n и продолжаем
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        // Вызываем рекурсивную функцию для разворота числа
        int reversed = reverseNumber(n, 0);

        // Выводим результат
        System.out.println("Разворот числа: " + reversed);
    }
}

