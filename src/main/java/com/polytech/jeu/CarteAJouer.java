package com.polytech.jeu;

import java.util.Arrays;
import java.util.List;

public class CarteAJouer {
    private final String couleur;
    private final String valeur;
    // Static car est utilisée par la classe et non une instance.
    // Final, car on ne veut pas pouvoir changer sa valeur après son initialisation
    private static final String[] COULEURS_VALIDES = {"PIQUE", "COEUR", "CARREAU", "TREFLE"};
    private static final String[] VALEURS_VALIDES = {"DEUX", "TROIS", "QUATRE", "CINQ", "SIX", "SEPT", "HUIT", "NEUF", "DIX", "VALET", "DAME", "ROI", "AS"};

    public CarteAJouer(String couleur, String valeur){
        this.couleur = couleur.toUpperCase();
        this.valeur = valeur.toUpperCase();

        if (!couleurEstValide(this.couleur)){
            throw new IllegalArgumentException("La couleur de la carte n'est pas valide");
        }

        if (!valeurEstValide(this.valeur)){
            throw new IllegalArgumentException("La valeur de la carte n'est pas valide");
        }
    }

    //Static car ne dépend pas d'une instance et n'est pas utilisée par une carte
    private static boolean couleurEstValide(String couleur) {
        List<String> couleuresValidesList = Arrays.asList(COULEURS_VALIDES);
        return couleuresValidesList.contains(couleur);
    }

    //Static car ne dépend pas d'une instance et n'est pas utilisée par une carte
    private static boolean valeurEstValide(String valeur) {
        List<String> valeursValidesList = Arrays.asList(VALEURS_VALIDES);
        return valeursValidesList.contains(valeur);
    }

    // Surcharge de la methode .toString de la classe Object
    public String toString(){
        return valeur+" de "+couleur;
    }

    public String getCouleur(){return couleur;}

    public String getValeur(){return valeur;}
}
