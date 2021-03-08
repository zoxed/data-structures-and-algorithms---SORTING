package com.zoxed;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("le nombre que vous voulez est  : ");

        int n = sc.nextInt();
        // supprimer .2 pour afficher tout le resultat
        System.out.printf("Resultat est %.2f", resultat(n));
    }

    static double resultat(int n)
    {
        // on peut utiliser aussi float  float i, r = 0;
        double i, r = 0;
        for (i = 1; i <= n; i++){
            r += 1/i;
        }
        return r;
    }
}
