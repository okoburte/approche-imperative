package fr.algorithmie;

import java.util.Arrays;

public class Rotation {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, 6};
        int cacheInt = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        array[array.length - 1] = cacheInt;

        System.out.println(Arrays.toString(array));
    }
}