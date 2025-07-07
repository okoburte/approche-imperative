package fr.algorithmie;

import java.util.Scanner;

public class Interactif21Batons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean tourJoueur = Math.random() < 0.5;
        int nbBaton = 21;

        System.out.println("Bienvenu au jeu des 21 batons !\n" +
                "Vous et votre adversaire aller retirer entre 1 et 3 baton a tour de role parmis les 21 disponible dau depart.\n" +
                ((tourJoueur ? "Vous etes " : "Votre adversaire est ") + "le premier joueur. Bonne chance !"));

        while (nbBaton > 0) {
            if (tourJoueur) {
                boolean reponseValide = false;
                while (!reponseValide) {
                    System.out.println("Veuillez retirer entre 1, 2 ou 3 batons :");
                    int reponse = scanner.nextInt();
                    if (reponse >= 1 && reponse <= 3 && nbBaton >= reponse) {
                        System.out.println("Vous retirez " + reponse + " batons.");
                        reponseValide = true;
                        nbBaton -= reponse;

                        if (nbBaton == 0) System.out.println("Il ne reste plus de baton. Vous avez perdu ...");
                        else System.out.println("Il reste encore " + nbBaton + " disponible !");
                    } else System.out.println("Reponse invalide.");
                }

                tourJoueur = false;
            } else {
                int reponseBot = (int) Math.ceil(Math.random() * 3);
                if (nbBaton <= 4) reponseBot = Math.max(1, nbBaton - 1);

                System.out.println("Votre adversaire retire " + reponseBot + " batons.");
                nbBaton -= reponseBot;

                if (nbBaton == 0) System.out.println("Il ne reste plus de baton. Vous avez gagné !");
                else System.out.println("Il reste encore " + nbBaton + " disponible !");

                tourJoueur = true;
            }
        }
    }
}
