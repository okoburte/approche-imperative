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

        System.out.println(Math.max(longueur - nbBig * 5, longueur % 5) <= nbSmall);
    }
}
