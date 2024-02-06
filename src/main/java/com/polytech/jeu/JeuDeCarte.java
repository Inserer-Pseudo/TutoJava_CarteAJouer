package com.polytech.jeu;

public class JeuDeCarte {
    private final CarteAJouer[] jeu;

    public JeuDeCarte(){
        jeu = new CarteAJouer[52];
        String[] couleurs = {"PIQUE","COEUR","CARREAU","TREFLE"};
        String[] valeurs = {"DEUX","TROIS","QUATRE","CINQ","SIX","SEPT","HUIT","NEUF","DIX","VALET","DAME","ROI","AS"};
        int index = 0;
        for (String couleur : couleurs){
            for (String valeur : valeurs){
                jeu[index] = new CarteAJouer(couleur, valeur);
                index++;
            }
        }
    }
    public String toString(){
        StringBuilder retour = new StringBuilder();
        for (CarteAJouer carte : jeu){
            retour.append(carte).append("\n");
        }
        return retour.toString();
    }
    public CarteAJouer[] getJeu(){
        return jeu;
    }
}
