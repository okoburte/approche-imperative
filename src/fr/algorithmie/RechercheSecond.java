package fr.algorithmie;

public class RechercheSecond {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int max = 0;
        int max2nd = 0;

        if (array.length > 1) {
            max = array[0] >= array[1] ? array[0] : array[1];
            max2nd = array[0] >= array[1] ? array[1] : array[0];

            for (int i = 0; i < array.length; i++) {
                if (max <= array[i]) {
                    max2nd = max;
                    max = array[i];
                } else if (max2nd < array[i]) {
                    max2nd = array[i];
                }
            }
        }

        System.out.println(max2nd);
    }
}
