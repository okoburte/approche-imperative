package fr.algorithmie;

import java.util.Scanner;

public class FabriquerMur {
    public static void main(String[] args) {
// Tests de vérification
        verifier(3, 1, 8, true);
        verifier(3, 1, 9, false);
        verifier(3, 2, 10, true);
        verifier(3, 2, 8, true);
        verifier(3, 2, 9, false);
        verifier(6, 1, 11, true);
        verifier(6, 0, 11, false);
        verifier(1, 4, 11, true);
        verifier(0, 3, 10, true);
        verifier(1, 4, 12, false);
        verifier(3, 1, 7, true);
        verifier(1, 1, 7, false);

        //Code ecrit avant d'avoir les fonction fabriquerMur et verifier
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("longueur du mur a construire ?");
//        int longueur = scanner.nextInt();
//        System.out.println("nombre de brique de longueur 1 ?");
//        int nbSmall = scanner.nextInt();
//        System.out.println("nombre de brique de longueur 5 ?");
//        int nbBig = scanner.nextInt();
//
//        System.out.println(Math.max(longueur - nbBig * 5, longueur % 5) <= nbSmall);
    }

    static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
        return Math.max(longueur - nbBig * 5, longueur % 5) <= nbSmall;
    }

    private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
        if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
            System.err.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");
        }
    }
}
