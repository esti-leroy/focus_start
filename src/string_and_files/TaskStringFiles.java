package string_and_files;

import java.util.Scanner;

public class TaskStringFiles {
    public static void main(String[] args) throws Exception {
        System.out.println("Программа работает с файлами и строками. Выберите 1 - строки, 2 - файлы.");
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        Handler handler;
        if (value == 1) {
            handler = new StringHandler();
        } else if (value == 2) {
            handler = new FileHandler();
        } else {
            throw new Exception("Некорректное значение.");
        }
        handler.handle();
    }
}
