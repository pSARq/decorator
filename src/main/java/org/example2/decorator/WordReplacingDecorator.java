package org.example2.decorator;

import org.example2.text.TextProcessor;

import java.util.Map;

public class WordReplacingDecorator extends TextProcessorDecorator {

    private final Map<String, String> replacementsMap;

    public WordReplacingDecorator(TextProcessor wrappedTextProcessor, Map<String, String> replacementsMap) {
        super(wrappedTextProcessor);
        this.replacementsMap = replacementsMap;
    }

    @Override
    public String process(String text) {
        String processedText = super.process(text);
        for (Map.Entry<String, String> entry : this.replacementsMap.entrySet()) {
            processedText = processedText.replace(entry.getKey(), entry.getValue());
        }
        return processedText;
    }
}
