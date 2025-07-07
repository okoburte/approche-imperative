package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        int[] intTab = {8, -7, 12, 1, -2, 14, 17, 9};

        System.out.println(intTab[0]);
        System.out.println(intTab.length);
        System.out.println(intTab[intTab.length-1]);
        // la ligne suivante ne compile pas car le tableau a une longueur inferieur a 10
        // System.out.println(intTab[10]);
    }
}
