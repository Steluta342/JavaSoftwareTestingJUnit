package calculator;

import org.example.calculator.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private static Calculator calculator;

    //before all seamana foarte mult cu initializarea unei instante de obiect
    //de tipul SINGLETON (design patern)
    @BeforeAll
    public static void setup(){
        System.out.println("S-a intrat in hookul de before all..");
        calculator = new Calculator();
    }

    //Adunarea ar trebui sa fie corecta pt nr intregi
    @Test
    public void testAdunare(){
        System.out.println("S-a intrat in testul pt verificarea adunarii!");
        double rezultatActual = calculator.adunare(4,5);
        //Definiti rezultatul actual asteptat -> Double rezultatAsteptat = 9;
        assertEquals(9, rezultatActual);//assert(expected, actual);

    }

    @Test
    public void testScadere(){
        System.out.println("S-a intrat in testul pt verificarea scaderii!");
        double rezultatActual = calculator.scadere(4,5);
        //Definiti rezultatul actual asteptat -> Double rezultatAsteptat = 9;
        assertEquals(-1, rezultatActual);//assert(expected, actual);

    }

}
