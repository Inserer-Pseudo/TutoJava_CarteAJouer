package com.polytech.jeu;

public class JeuDeCarte {
    private final CarteAJouer[] jeu;
    private static final String[] couleurs = {"PIQUE", "COEUR", "CARREAU", "TREFLE"};
    private static final String[] valeurs = {"DEUX", "TROIS", "QUATRE", "CINQ", "SIX", "SEPT", "HUIT", "NEUF", "DIX", "VALET", "DAME", "ROI", "AS"};

    public JeuDeCarte(){
        jeu = new CarteAJouer[52];
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
            //carte <-> carte.toString
            retour.append(carte).append("\n");
        }
        return retour.toString();
    }
    public CarteAJouer[] getJeu(){
        return jeu;
    }

    public String getCarte(String couleur, String valeur) {
        String reference = "";
        for (CarteAJouer carte : jeu) {
            if (carte.getCouleur().equalsIgnoreCase(couleur) && carte.getValeur().equalsIgnoreCase(valeur)) {
                //reference =  Integer.toHexString(hashCode());
                reference = String.valueOf(System.identityHashCode(carte));
            }
        }
        return reference;
    }
}
