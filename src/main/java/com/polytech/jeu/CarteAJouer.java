package com.polytech.jeu;

import java.util.Arrays;
import java.util.List;

public class CarteAJouer {
    private String couleur;
    private String valeur;
    private String[] couleursValides = {"PIQUE","COEUR","CARREAU","TREFLE"};
    private String[] valeursValides = {"DEUX","TROIS","QUATRE","CINQ","SIX","SEPT","HUIT","NEUF","DIX","VALET","DAME","ROI","AS"};

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

    private boolean couleurEstValide(String couleur){
        List<String> couleuresValidesList = Arrays.asList(couleursValides);
        return couleuresValidesList.contains(couleur);
    }

    private boolean valeurEstValide(String valeur){
        List<String> valeursValidesList = Arrays.asList(valeursValides);
        return valeursValidesList.contains(valeur);
    }

    public String toString(){
        return valeur+" de "+couleur;
    }

    public String getCouleur(){return couleur;}

    public String getValeur(){return valeur;}
}
