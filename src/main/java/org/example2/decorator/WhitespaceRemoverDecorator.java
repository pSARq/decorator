package org.example2.decorator;

import org.example2.text.TextProcessor;

public class WhitespaceRemoverDecorator extends TextProcessorDecorator {

    public WhitespaceRemoverDecorator(TextProcessor wrappedTextProcessor) {
        super(wrappedTextProcessor);
    }

    @Override
    public String process(String text) {
        return super.process(text).replaceAll("\\s+", "");
    }
}
