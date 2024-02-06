package com.polytech;

import com.polytech.jeu.CarteAJouer;
import com.polytech.jeu.JeuDeCarte;

public class Main {
    public static void main(String[] args){
        System.out.println(new CarteAJouer("Pique", "roi"));
        System.out.println(new CarteAJouer("trefle", "DAME"));
        System.out.println(new CarteAJouer("TREFLE", "troIs"));
        System.out.println(new CarteAJouer("carreau", "sept"));
        System.out.println(" ");

        JeuDeCarte jeu = new JeuDeCarte();

        System.out.println(jeu);

        
    }
}