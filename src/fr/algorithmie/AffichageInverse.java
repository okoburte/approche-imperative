package fr.algorithmie;

import java.util.Arrays;

public class AffichageInverse {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        for (int val : array) {
            System.out.println(val);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[array.length - 1 - i]);
        }

        int[] arrayCopy = Arrays.copyOf(array, array.length);
    }
}
