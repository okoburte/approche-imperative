package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nb = 0;

        while (nb < 1 || nb > 10) {
            System.out.println("Entrez un nombre entier entre 1 et 10 :");
            nb = scanner.nextInt();
        }

        System.out.println("Votre nombre " + nb + " est bien compris entre 1 et 10 !");
    }
}
