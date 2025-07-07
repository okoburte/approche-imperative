package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nbArray = new int[0];
        int reponse = 0;

        while(reponse != 3) {
            System.out.println("Choisissez une option :\n1. Ajouter un nombre\n2. Afficher les nombres existants\n3. Quitter le programme");
            reponse = scanner.nextInt();
            switch (reponse) {
                case 1:
                    System.out.println("Veuillez entrer un nombre entier à ajouter au tableau :");
                    nbArray = Arrays.copyOf(nbArray, nbArray.length+1);
                    nbArray[nbArray.length-1] = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Voici le contenu actuel du tableau :\n" + Arrays.toString(nbArray));
                    break;
                case 3:
                    System.out.println("Merci d'avoir utilisé notre application ! au revoir !");
                    break;
                default:
                    System.out.println("La reponse saisi n'est pas valide... veuillez choisir une option valide en tapant les nombres entier 1, 2 ou 3.");
                    break;

            }
        }
    }
}
