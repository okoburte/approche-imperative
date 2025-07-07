package fr.algorithmie;

import java.util.Scanner;

public class FabriquerMur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("longueur du mur a construire ?");
        int longueur = scanner.nextInt();
        System.out.println("nombre de brique de longueur 1 ?");
        int nbSmall = scanner.nextInt();
        System.out.println("nombre de brique de longueur 5 ?");
        int nbBig = scanner.nextInt();

        if(nbBig*5 <= longueur) {
            System.out.println((longueur-nbBig*5) <= nbSmall);
        }
        else {
            System.out.println(longueur%5 <= nbSmall);
        }
    }
}
