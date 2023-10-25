package org.example.classes;

import org.example.interfaces.PreProcessor;
import org.example.interfaces.Renderer;

public class RendererErrImpl implements PreProcessor, Renderer {
    private PreProcessor preProcessor;

    public RendererErrImpl(PreProcessor preProcessor) {
        this.preProcessor = preProcessor;
    }

    public PreProcessor getPreProcessor() {
        return preProcessor;
    }
}
