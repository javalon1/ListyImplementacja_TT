package com.sda.algorytmy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie {
    public static void zad1(){
        List<String> listaImion = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        String a;
        do {
            System.out.println("Podaj imię");
            a = sc.nextLine();
            listaImion.add(a);
        }while (!a.equals("-"));

            listaImion.remove("-");

        for(String el:listaImion){
            System.out.println(el);
        }

    }
}
