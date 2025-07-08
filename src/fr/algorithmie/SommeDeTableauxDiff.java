package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ;

        int[] arraySomme = new int[Math.max(array1.length, array2.length)];

        for (int i = 0; i < arraySomme.length; i++) {
            int val1 = i < array1.length? array1[i]: arraySomme[i];
            int val2 = i < array2.length? array2[i]: arraySomme[i];
            arraySomme[i] = val1 + val2;
        }

        System.out.println(Arrays.toString(arraySomme));
    }
}
