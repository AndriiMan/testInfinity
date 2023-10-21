package org.example.task3.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Faktura
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Invoice extends Document {
    private String invoiceType;

    @Override
    public double getRabat() {
        return 0.0;
    }
}