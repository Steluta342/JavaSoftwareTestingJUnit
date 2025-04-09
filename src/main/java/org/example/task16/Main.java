package org.example.task16;

public class Main {

    public static void main(String[] args) {
        LongestSubSeq longestSubSeq = new LongestSubSeq();

        System.out.println("Lungimea maxima a unei sub-secvente crescatoare este: "
                + longestSubSeq.calculeazaLungimeaMaxSubSeq(10, new int[]{1, 3, 8, 4, 2, 5, 6, 11, 13, 7}));
    }
}