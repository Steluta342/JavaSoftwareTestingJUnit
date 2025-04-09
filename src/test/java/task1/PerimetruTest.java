package task1;

import org.example.task1.Perimetru;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Period;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerimetruTest {
    //instanta de obiect se defineste mereu la nivel de clasa
    private Perimetru perimetru;

    /* Hook inainte de fiecare test */
    @BeforeEach
    public void init(){
        System.out.println("S-a intrat in testul de before each...");
        //
        perimetru = new Perimetru();

    }


    /* Testul functional - de regula se utilizeaza date de test pentru un happy flow comun */
    @Test
    @DisplayName("Test pentru verificarea unui happy flow!")
    public void testPerimetruHappyFlow() {

        //se poate defini parametru ca variabila a metodei de test
        //astfel incat sa fie pasat la definirea celor doua variabile de rezultat

        double rezultatActual = perimetru.calculeazaPerimetru(2.0);
        double rezultatAsteptat = 2.0 * Math.PI;

        assertEquals(rezultatAsteptat, rezultatActual, 0.0001);

    }

    @Test
    @Disabled
    /* Boundary test -> verifica valori in zona lui 0, empty sau null */
    public void testPerimetruZero() {

        double rezultatActual = perimetru.calculeazaPerimetru(0.0);

        assertEquals(0.0, rezultatActual, 0.0001);
    }

    /* Negative test / Test de negativ -> verifica volori in zona numerelor negative */
    @Test
    @DisplayName("Test pt verificarea unui set de date negativ")
    @Disabled
    public void testPerimetruNumareNegative() {
        double rezultatActual = perimetru.calculeazaPerimetru(-2.0);
        assertEquals(-2.0 * Math.PI, rezultatActual, 0.0001);
    }

    /*  Test de precizie -> verifica valori fractionare  */
    @Test
    public void testPerimetruPrecizie() {

        double rezultatActual = perimetru.calculeazaPerimetru(1.5);
        assertEquals(4.71239, rezultatActual, 0.0001);
    }

    /*Scaling Test -> verifica valori intr-o plaja de multiplicari */
    @Test
    public void testPerimetruScalat() {

        double diametru1 = 5.0;
        double diametru2 = 2 * diametru1;

        double rezultatAsteptatP1 = perimetru.calculeazaPerimetru(diametru1);
        double rezultatAsteptatP2 = perimetru.calculeazaPerimetru(diametru2);
        assertEquals(rezultatAsteptatP1 * 2, rezultatAsteptatP2, 0.0001 );
    }


}

