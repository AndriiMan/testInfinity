package org.example.task3.rules;

import javax.swing.text.Document;

public interface ExportRule {
    boolean matches(String format);
    void apply(Document document);
}