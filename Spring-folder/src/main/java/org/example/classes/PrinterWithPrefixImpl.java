package org.example.classes;

import org.example.interfaces.Printer;
import org.example.interfaces.Renderer;

public class PrinterWithPrefixImpl implements Printer {
    private String prefix;
    private Renderer renderer;

    public PrinterWithPrefixImpl(Renderer renderer) {
        this.renderer = renderer;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }


    public void print(String message) {
        if (renderer instanceof RendererStandardImpl) {
            if (renderer.getPreProcessor() instanceof PreProcessorToLowerImpl)
                System.out.println((prefix + " " + message).toLowerCase());
            if (renderer.getPreProcessor() instanceof PreProcessorToUpperImpl)
                System.out.println((prefix + " " + message).toUpperCase());
        } else if (renderer instanceof RendererErrImpl) {
            if (renderer.getPreProcessor() instanceof PreProcessorToLowerImpl)
                System.err.println((prefix + " " + message).toLowerCase());
            if (renderer.getPreProcessor() instanceof PreProcessorToUpperImpl)
                System.err.println((prefix + " " + message).toUpperCase());
        }
    }
}
