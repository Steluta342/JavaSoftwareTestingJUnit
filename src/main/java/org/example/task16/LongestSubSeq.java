package org.example.task16;

import java.util.InputMismatchException;

public class LongestSubSeq {

    public int calculeazaLungimeaMaxSubSeq(int dim, int[] numere) {
        if (dim != numere.length) {
            throw new InputMismatchException("Dimensiunile ar trebui sa fie egale!");
        }

        int lungimeaMaxima = 1, lungimeaCurenta = 1;

        for (int i = 0; i < dim - 1; i++) {
            if (numere[i] < numere[i + 1]) {
                lungimeaCurenta++;
                lungimeaMaxima = Math.max(lungimeaMaxima, lungimeaCurenta);
            } else {
                lungimeaCurenta = 1;
            }
        }

        return lungimeaMaxima;
    }
}






