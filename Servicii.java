package com.itfactory;

import java.util.ArrayList;
import java.util.List;

public class Servicii extends Persoana{

    public Servicii ( long CNP,String numeComplet) {
        super( CNP,numeComplet);
    }

public static void listaPersoana() {
        List <Persoana> listaPersoane = new ArrayList<>();
        listaPersoane.add(new Persoana(2987652489123L,"Mariana Draghici"));
        listaPersoane.add(new Persoana(1846249125473L,"Daniel Cornaci" ));
        listaPersoane.add(new Persoana(1756489254135L,"Bogdan Avadanei"));
        listaPersoane.add(new Persoana(265324578125L,"Adriana Bocancea"));
        listaPersoane.add(new Persoana(1684689124513L,"Vlad Grigore"));
        listaPersoane.add(new Persoana(2961254781345L,"Elena Marcoci"));
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
