package com.zoxed;

import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int somme;
        System.out.print("somme : ");
        somme = input.nextInt();
        int billet100 = somme / 100;
        int reste100 = somme % 100;
        System.out.printf("==> %4d billet(s) de 100 euros, reste %d%n",billet100,reste100);
        int billet50 = reste100 / 50;
        int reste50 = reste100 % 50;
        System.out.printf("==> %4d billet(s) de 50 euros, reste %d%n",billet50,reste50);
        int billet10 = reste50 / 10;
        int reste10 = reste50 % 10;
        System.out.printf("==> %4d billet(s) de 10 euros, reste %d%n",billet10,reste10);
        int piece2 = reste10 / 2;
        int reste2 = reste10 % 2;
        System.out.printf("==> %4d pieces(s) de 2 euros, reste %d%n",piece2,reste2);
        int piece1 = reste2;
        System.out.printf("==> %4d pieces(s) de 1 euro%n",piece1);
    }
}
