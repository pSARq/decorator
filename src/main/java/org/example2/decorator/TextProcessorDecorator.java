package org.example2.decorator;

import org.example2.text.TextProcessor;

public abstract class TextProcessorDecorator implements TextProcessor {

    protected final TextProcessor wrappedTextProcessor;

    public TextProcessorDecorator(TextProcessor wrappedTextProcessor) {
        this.wrappedTextProcessor = wrappedTextProcessor;
    }

    @Override
    public String process(String text) {
        return wrappedTextProcessor.process(text);
    }
}
