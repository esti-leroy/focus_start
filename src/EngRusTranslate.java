import java.util.HashMap;
import java.util.Map;

public class EngRusTranslate implements LangTranslateStrategy {
    private static Map<String, String> engRus = new HashMap<>();

    static {
        engRus.put("Hello", "Привет");
        engRus.put("Cool", "Круто");
        engRus.put("Weather", "Погода");
        engRus.put("Forest", "Лес");
    }

    @Override
    public String translate(String word) {
        return engRus.get(word);
    }
}
