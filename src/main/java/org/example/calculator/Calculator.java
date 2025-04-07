package org.example.calculator;

public class Calculator {

    public double adunare(double a, double b) {
        return a + b;
    }

    public double scadere(double a, double b) {
        return a - b;
    }

    public double inmultire(double a, double b) {
        return a * b;
    }

    public double impartire(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Nu se poate face diviziune la 0!");
        }
        return a / b;
    }

}
