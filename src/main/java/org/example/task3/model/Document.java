package org.example.task3.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Document {
    private String issuer;
    private String recipient;
    private Date issueDate;
    private int documentNumber;

    public double getRabat() {
        return 0.0;
    }
}