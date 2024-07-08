package org.example2.decorator;

import org.example2.text.TextProcessor;

public class UpperCaseDecorator extends TextProcessorDecorator {

    public UpperCaseDecorator(TextProcessor wrappedTextProcessor) {
        super(wrappedTextProcessor);
    }

    @Override
    public String process(String text) {
        return super.process(text).toUpperCase();
    }
}
