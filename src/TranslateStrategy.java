import java.util.Scanner;

public class TranslateStrategy {

    public static void main(String[] args) {
        System.out.println("Переводчик. Для выхода из программы введите точку. " +
                "Для переключения перевода с русского на английский введите ?rus-eng, с английского на русский ?eng-rus.");
        System.out.println("Введите слово для перевода:");
        Scanner scan = new Scanner(System.in);
        TranslateContext context = new TranslateContext();
        context.setStrategy(new EngRusTranslate());
        String word = scan.next();
        while (!word.equals(".")) {
            if (word.equals("?rus-eng")) {
                context.setStrategy(new RusEngTranslate());
            } else if (word.equals("?eng-rus")) {
                context.setStrategy(new EngRusTranslate());
            } else {
                String translated = context.doTranslate(word);
                if (translated == null) {
                    System.out.println("Слово не найдено, переключите режим перевода");
                } else {
                    System.out.println(translated);
                }
            }
            System.out.println("Введите слово для перевода:");
            word = scan.next();
        }
    }
}
