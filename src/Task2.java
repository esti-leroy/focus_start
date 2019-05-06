import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Я загадываю число от 0 до 9…");
        int random = new Random().nextInt(10);
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Предположение первого игрока:");
            int first = in.nextInt();
            System.out.println("Предположение второго игрока:");
            int second = in.nextInt();
            if (random == first || random == second) {
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал? - " + (random == first));
                System.out.println("Второй игрок угадал? - " + (random == second));
                break;
            }
            System.out.println("Игроки должны попробовать ещё раз");
        }
    }
}
