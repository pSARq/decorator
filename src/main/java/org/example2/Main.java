package org.example2;

import org.example2.decorator.UpperCaseDecorator;
import org.example2.decorator.WhitespaceRemoverDecorator;
import org.example2.decorator.WordReplacingDecorator;
import org.example2.text.*;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "Mensaje de prueba";

        TextProcessor reversionProcessor = new ReversingTextProcessor();
        System.out.println(reversionProcessor.process(text));

        TextProcessor vowelRemovingProcessor = new VowelRemovingTextProcessor();
        System.out.println(vowelRemovingProcessor.process(text));

        TextProcessor wordCountingProcessor = new WordCountingTextProcessor();
        System.out.println(wordCountingProcessor.process(text));

        Map<String, String> replacements = Map.of(
                "Mensaje", "Nuevo mensaje",
                "prueba", "nueva prueba"
        );

        TextProcessor wordReplacingProcessor = new WordReplacingDecorator(new SimpleTextProcessor(), replacements);
        System.out.println(wordReplacingProcessor.process(text));

        TextProcessor complexProcessor = new WordReplacingDecorator(
                new WhitespaceRemoverDecorator(
                        new UpperCaseDecorator(
                                new SimpleTextProcessor()
                        )
                ),
                replacements
        );
        System.out.println(complexProcessor.process(text));

    }
}
