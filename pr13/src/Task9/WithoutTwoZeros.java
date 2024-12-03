package Task9;

import java.util.Scanner;

public class WithoutTwoZeros {
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long combinations(int n, int k) {
        if (k > n || k < 0) {
            return 0;
        }
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество нулей (a): ");
        int a = scanner.nextInt();
        System.out.print("Введите количество единиц (b): ");
        int b = scanner.nextInt();
        long result = combinations(b + 1, a);

        System.out.println("Количество последовательностей: " + result);
    }
}

