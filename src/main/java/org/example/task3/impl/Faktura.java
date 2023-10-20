package org.example.task3.impl;

import org.example.task3.Dokument;

import java.util.Date;

public class Faktura implements Dokument {
    private String typFaktury;
    // pozostałe pola i metody

    @Override
    public String getWystawca() {
        return null;
    }

    @Override
    public String getOdbiorca() {
        return null;
    }

    @Override
    public Date getDataWystawienia() {
        return null;
    }

    @Override
    public int getNumerDokumentu() {
        return 0;
    }

    @Override
    public double getRabat() {
        // logika pobrania rabatu z nagłówka faktury
        return 0.0; // przykładowy zwrot rabatu
    }
}