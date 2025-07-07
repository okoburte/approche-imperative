package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonnaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb = -1;

        while (nb < 0) {
            System.out.println("Veuillez entrer un nombre entier positif pour en savoir la valeur dans la suite de Fibonnaci :");
            nb = scanner.nextInt();
        }

        if(nb < 2) System.out.println("F("+ nb +") = "+ nb);
        else {
            int n2 = 0;
            int n1 = 1;
            int fibonnaciValue = 0;

            for (int i = 1; i < nb; i++) {
                fibonnaciValue = n1 + n2;
                n2 = n1;
                n1 = fibonnaciValue;
            }

            System.out.println("F("+ nb +") = "+ fibonnaciValue);
        }
    }
}
