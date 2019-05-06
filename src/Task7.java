import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Введите номер месяца");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        if (3 <= month && month <= 5) {
            System.out.println("Весна");
        } else if (6 <= month && month <= 8) {
            System.out.println("Лето");
        } else if (9 <= month && month <= 11) {
            System.out.println("Осень");
        } else if (0 < month && month <= 2 || month == 12) {
            System.out.println("Зима");
        } else {
            System.out.println("Некорректное значение");
        }
    }
}
