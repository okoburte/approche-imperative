package fr.algorithmie;

public class NombreParfait {
    public static void main(String[] args) {
        int numberInt = 28;
        int sommeDiv = 0;

        for (int i = 1; i < numberInt; i++) {
            if (numberInt % i == 0) {
                sommeDiv += i;
            }
        }

        System.out.println(numberInt + " est un nombre parfait : " + (sommeDiv == numberInt));
    }
}
