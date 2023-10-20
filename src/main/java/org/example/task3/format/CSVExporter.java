package org.example.task3.format;

import org.example.task3.Dokument;
import org.example.task3.Exporter;

public class CSVExporter implements Exporter {
    @Override
    public String export(Dokument dokument) {
        // logika eksportu do CSV
        return "Dokument wyeksportowany do CSV";
    }
}