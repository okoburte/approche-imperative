package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Entrez un nombre entier :");
        int nb = scanner.nextInt();

        int somme = 0;
        for (int i = 1; i <= nb; i++) {
            somme += i;
        }

        System.out.println(somme);
    }
}
