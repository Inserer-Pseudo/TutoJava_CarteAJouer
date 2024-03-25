package com.polytech.jeu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarteAJouerTest {

    @Test
    void carteAJouerSansException() {
        CarteAJouer carte = new CarteAJouer("pique", "roi");
        assertInstanceOf(CarteAJouer.class, carte);
    }

    @Test
    void carteAJouerAvecExceptionSurLaCouleur() {
        assertThrows(IllegalArgumentException.class, () ->
                new CarteAJouer("test", "roi")
        );
    }

    @Test
    void carteAJouerAvecExceptionSurLaValeur() {
        assertThrows(IllegalArgumentException.class, () ->
                new CarteAJouer("pique", "blabla")

        );
    }

    @Test
    void carteAJouerTestFlexibilite1() {
        assertDoesNotThrow(() -> new CarteAJouer("Pique", "roi"));
    }

    @Test
    void carteAJouerTestFlexibilite2() {
        assertDoesNotThrow(() -> new CarteAJouer("trefle", "DAME"));
    }

    @Test
    void carteAJouerTestFlexibilite3() {
        assertDoesNotThrow(() -> new CarteAJouer("TREFLE", "troIs"));
    }

    @Test
    void carteAJouerTestFlexibilite4() {
        assertDoesNotThrow(() -> new CarteAJouer("carreau", "sept"));
    }


}