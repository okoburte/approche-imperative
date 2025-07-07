package fr.algorithmie;

public class AffichagePartiel {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        for (int val : array) {
            if (val > 3) System.out.println(val);
        }

        for (int value : array) {
            if (value % 2 == 0) System.out.println(value);
        }

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) System.out.println(array[i]);
        }

        for (int value : array) {
            if (value % 2 != 0) System.out.println(value);
        }
    }
}
