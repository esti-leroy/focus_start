import java.util.HashMap;
import java.util.Map;

public class RusEngTranslate implements LangTranslateStrategy {

    private static Map<String, String> rusEng = new HashMap<>();

    static {
        rusEng.put("Привет", "Hello");
        rusEng.put("Круто", "Cool");
        rusEng.put("Погода", "Weather");
        rusEng.put("Лес", "Forest");
    }

    @Override
    public String translate(String word) {
        return rusEng.get(word);
    }
}
