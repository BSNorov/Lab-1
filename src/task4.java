import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Всем привет! Эта программа рассчитывает площадь прямоугольника");

        System.out.print("Введите длину прямоугольника: (положительное число): ");
        double length_square = sc.nextDouble();

        if (length_square <= 0) {
            System.out.println("Ошибка: длина должна быть положительным числом");
            return;
        }

        System.out.print("Введите ширину прямоугольника (положительное число): ");
        double width_square = sc.nextDouble();

        if (width_square <= 0) {
            System.out.println("Ошибка: ширина должна быть положительным числом");
            return;
        }

        double square = length_square * width_square;

        System.out.println("Площадь прямоугольника: " + square);

        sc.close();
    }
}

