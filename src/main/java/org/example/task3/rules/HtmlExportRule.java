package org.example.task3.rules;

import javax.swing.text.Document;

public class HtmlExportRule implements ExportRule {
    @Override
    public boolean matches(String format) {
        return format.equalsIgnoreCase("HTML");
    }

    @Override
    public void apply(Document document) {
        // Logic for exporting to HTML
    }
}