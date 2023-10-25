package org.example.classes;

import org.example.interfaces.PreProcessor;
import org.example.interfaces.Renderer;

public class RendererStandardImpl implements PreProcessor, Renderer {
    private PreProcessor preProcessor;

    public RendererStandardImpl(PreProcessor preProcessor) {
        this.preProcessor = preProcessor;
    }

    public PreProcessor getPreProcessor() {
        return preProcessor;
    }
}
