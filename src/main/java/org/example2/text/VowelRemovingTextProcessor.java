package org.example2.text;

public class VowelRemovingTextProcessor implements TextProcessor {
    @Override
    public String process(String text) {
        return text.replaceAll("[AEIOUaeiou]", "");
    }
}
