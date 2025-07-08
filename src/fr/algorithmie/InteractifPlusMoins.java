package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomInt = (int) Math.ceil(Math.random() * 100);
        int reponse = -1;
        int nbCoup = 0;
        System.out.println("Trouve Le nombre entier entre 1 et 100 !");

        while (reponse != randomInt) {
            System.out.println("Donner un nombre entre 1 et 100 :");
            reponse = scanner.nextInt();
            nbCoup++;
            if (reponse > randomInt) System.out.println("C'est Moins !");
            else if (reponse < randomInt) System.out.println("C'est Plus !");
            else System.out.println("Bravo ! Vous avez trouvé en " + nbCoup + " coups !");
        }
    }
}
