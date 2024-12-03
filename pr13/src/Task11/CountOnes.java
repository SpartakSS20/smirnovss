package Task11;

import java.util.Scanner;

public class CountOnes {
    public static void main(String[] args) {
        countOnes();
    }

    public static void countOnes() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int number;

        System.out.println("Введите последовательность чисел, завершающуюся двумя нулями:");

        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                number = scanner.nextInt();
                if (number == 0) {
                    break;
                } else {
                    continue;
                }
            }

            if (number == 1) {
                count++;
            }
        }

        System.out.println("Количество единиц: " + count);
        scanner.close();
    }
}
