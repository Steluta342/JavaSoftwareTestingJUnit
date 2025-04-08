package org.example.task1;

public class Perimetru {
    //se mai poate crea un atribut double diametru
    //si metoda de calcul se modifica la parametri, devine neparametrizata
    //iar pe return invocam this.diametru
    public double calculeazaPerimetru(double diametru) {
        return Math.PI * diametru;

    }

}
