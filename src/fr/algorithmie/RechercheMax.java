package fr.algorithmie;

public class RechercheMax {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int maxValue = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == 0 || array[i] > maxValue) maxValue = array[i];
        }

        System.out.println(maxValue);
    }
}
