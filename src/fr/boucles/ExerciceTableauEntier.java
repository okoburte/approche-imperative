package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args) {
        int[] tabInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(tabInt[0]);
        System.out.println(tabInt.length);
        System.out.println(tabInt[tabInt.length-1]);
        tabInt[4] = 8;
    }
}
