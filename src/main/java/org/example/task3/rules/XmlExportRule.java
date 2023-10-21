package org.example.task3.rules;

import javax.swing.text.Document;

public class XmlExportRule implements ExportRule {
    @Override
    public boolean matches(String format) {
        return format.equalsIgnoreCase("XML");
    }

    @Override
    public void apply(Document document) {
        // Logic for exporting to XML
    }
}