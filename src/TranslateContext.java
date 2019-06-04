public class TranslateContext {
    private LangTranslateStrategy translateStrategy;

    public void setStrategy(LangTranslateStrategy strategy) {
        translateStrategy = strategy;
    }

    public String doTranslate(String word) {
        return translateStrategy.translate(word);
    }
}
