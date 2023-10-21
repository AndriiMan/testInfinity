package org.example.task3;
import org.example.task3.rules.CsvExportRule;
import org.example.task3.rules.ExportRule;
import org.example.task3.rules.HtmlExportRule;
import org.example.task3.rules.XmlExportRule;

import javax.swing.text.Document;
import java.util.ArrayList;
import java.util.List;

public class DocumentExporter {
    private List<ExportRule> exportRules;

    public DocumentExporter() {
        exportRules = new ArrayList<>();
        exportRules.add(new HtmlExportRule());
        exportRules.add(new CsvExportRule());
        exportRules.add(new XmlExportRule());
    }

    public void exportDocument(Document document, String format) {
        for (ExportRule rule : exportRules) {
            if (rule.matches(format)) {
                rule.apply(document);
                return;
            }
        }
        System.out.println("Unsupported format for export.");
    }
}