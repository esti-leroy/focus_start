import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = scanner.nextInt();
        System.out.println("Введите число b");
        int b = scanner.nextInt();
        int count = 0;
        while (a <= b) {
            if (a > 0 && a % 12 == 0) {
                count++;
            }
            a++;
        }
        System.out.println(count);
    }
}
