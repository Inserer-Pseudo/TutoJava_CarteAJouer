package com.polytech;

import com.polytech.jeu.CarteAJouer;
import com.polytech.jeu.JeuDeCarte;

public class Main {
    public static void main(String[] args){
        System.out.println("Test classe carte :");
        System.out.println(new CarteAJouer("Pique", "roi"));
        System.out.println(new CarteAJouer("trefle", "DAME"));
        System.out.println(new CarteAJouer("TREFLE", "troIs"));
        System.out.println(new CarteAJouer("carreau", "sept"));
        System.out.println(" ");

        System.out.println("Jeu de carte :");
        JeuDeCarte jeu = new JeuDeCarte();
        System.out.println(jeu);

        System.out.println("Hashcode carte :");
        System.out.println(jeu.getCarte("piQUe", "trOis"));
        System.out.println(jeu.getCarte("pique", "trois"));
        System.out.println(jeu.getCarte("CARREAU", "ROI"));
    }
}