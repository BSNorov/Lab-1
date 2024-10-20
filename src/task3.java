import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = sc.nextInt();
        System.out.print("Введите первое число: ");
        int b = sc.nextInt();
        System.out.print("Введите первое число: ");
        int c = sc.nextInt();

        int positiveDigits = 0;
        int negativeDigits = 0;

        if (a > 0) {
            positiveDigits++;
        } else if (a < 0) {
            negativeDigits++;
        }

        if (b > 0) {
            positiveDigits++;
        } else if (b < 0) {
            negativeDigits++;
        }

        if (c > 0) {
            positiveDigits++;
        } else if (c < 0) {
            negativeDigits++;
        }

        System.out.println("Количество положительных чисел: " + positiveDigits);
        System.out.println("Количество отрицательных чисел: " + negativeDigits);

        sc.close();
    }
}