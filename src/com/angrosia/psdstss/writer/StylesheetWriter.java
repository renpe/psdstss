package com.angrosia.psdstss.writer;

import com.angrosia.psdstss.model.PsdFileContent.Slice;

import java.io.IOException;

public abstract class StylesheetWriter {
    protected String outputPath;
    protected String classPrefix;

    protected boolean verbose = false;

    protected StylesheetWriter(String outputPath, String classPrefix) {
        this.outputPath = outputPath;
        this.classPrefix = classPrefix.replaceAll("[^A-Za-z0-9-_]", "");
    }

    public void setVerbose(boolean verbose) {
        this.verbose = verbose;
    }

    public abstract void writeSlice(Slice slice) throws Exception;

    public abstract void done() throws IOException;
}
