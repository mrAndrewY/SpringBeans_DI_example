package org.example.classes;

import org.example.interfaces.Printer;
import org.example.interfaces.Renderer;

import java.time.LocalDateTime;

public class PrinterWithDateTimeImpl implements Printer {
    private Renderer renderer;

    public PrinterWithDateTimeImpl(Renderer renderer) {
        this.renderer = renderer;
    }

    public void print(String message) {
        if (renderer instanceof RendererStandardImpl) {
            if (renderer.getPreProcessor() instanceof PreProcessorToLowerImpl)
                System.out.println((LocalDateTime.now() + " " + message).toLowerCase());
            if (renderer.getPreProcessor() instanceof PreProcessorToUpperImpl)
                System.out.println((LocalDateTime.now() + " " + message).toUpperCase());
        } else if (renderer instanceof RendererErrImpl) {
            if (renderer.getPreProcessor() instanceof PreProcessorToLowerImpl)
                System.err.println((LocalDateTime.now() + " " + message).toLowerCase());
            if (renderer.getPreProcessor() instanceof PreProcessorToUpperImpl)
                System.err.println((LocalDateTime.now() + " " + message).toUpperCase());
        }
    }
}
