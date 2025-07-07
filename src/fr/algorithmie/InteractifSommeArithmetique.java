package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somme = 0;

        System.out.println("Entrez un nombre entier :");
        int nb = scanner.nextInt();

        for (int i = 1; i <= nb; i++) {
            somme += i;
        }

        System.out.println(somme);
    }
}
