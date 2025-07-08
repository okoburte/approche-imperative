package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nb = 0;

        while (nb < 1 || nb > 10) {
            System.out.println("Entrez un nombre entier entre 1 et 10 :");
            nb = scanner.nextInt();
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(nb * i);
        }
    }
}
