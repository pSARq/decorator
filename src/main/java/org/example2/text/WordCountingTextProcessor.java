package org.example2.text;

public class WordCountingTextProcessor implements TextProcessor {
    @Override
    public String process(String text) {
        int count = text.split("\\s+").length;
        return "La cadena contiene " + count + " palabras";
    }
}
