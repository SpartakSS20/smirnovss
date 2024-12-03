package Task10;

import java.util.Scanner;

public class ReverseNumber {
    public static int reverseNumber(int n, int reversed) {
        if (n == 0) {
            return reversed;
        }
        reversed = reversed * 10 + n % 10;
        return reverseNumber(n / 10, reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int reversed = reverseNumber(n, 0);
        System.out.println("Разворот числа: " + reversed);
    }
}
