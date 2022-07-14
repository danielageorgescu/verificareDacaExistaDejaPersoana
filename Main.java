package com.itfactory;

import java.util.Scanner;

public class Main extends Servicii{

    public Main(long CNP,String numeComplet ) {
        super(CNP, numeComplet);
    }

    public static void main(String[] args) {
        System.out.println("Introduceti CNP-ul pe care doriti sa il verificati.");
    try{
        long CNPIntrodus = verificareCNP();
        System.out.println("sunt in try");
    }catch (ServiceException e){
        e.printStackTrace();
    }

    }
    public static long verificareCNP() throws ServiceException{
        Scanner scanner = new Scanner(System.in);
        long CNPIntrodus = Long.parseLong(scanner.nextLine());
// nu imi dau seama cum sa verific daca listaPersoana contine CNPIntrodus
        for(long CNPverificat : Servicii.listaPersoana());
        if (!((listaPersoane().contains(CNPIntrodus)))){
            throw new ServiceException("CNP-ul nu exista in baza de date. Va rugam sa mai incercati o data.");
        }
        System.out.println("sunt in verificareCNP");
        return CNPIntrodus;
    }
}





