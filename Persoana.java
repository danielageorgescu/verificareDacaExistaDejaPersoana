package com.itfactory;

import java.util.Objects;
import java.util.StringJoiner;

public class Persoana {
    private long CNP;
    private String numeComplet;


    public  Persoana (long CNP, String numeComplet){
        this.CNP = CNP;
        this.numeComplet = numeComplet;

    }


    public long getCNP() {
        return CNP;
    }

    public String getNumeComplet() {
        return numeComplet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persoana)) return false;
        Persoana persoana = (Persoana) o;
        return getCNP() == persoana.getCNP() && getNumeComplet().equals(persoana.getNumeComplet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumeComplet(), getCNP());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Persoana.class.getSimpleName() + "[", "]")
                .add("numeComplet='" + numeComplet + "'")
                .add("CNP=" + CNP)
                .toString();
    }
}
