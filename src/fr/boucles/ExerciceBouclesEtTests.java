package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        for(int value: array) {
            System.out.println(value);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[array.length-1-i]);
        }

        for(int value: array) {
            if(value > 3) System.out.println(value);
        }

        for(int value: array) {
            if(value%2 == 0) System.out.println(value);
        }

        for (int i = 0; i < array.length; i++) {
            if(i%2 == 0) System.out.println(array[i]);
        }

        for(int value: array) {
            if(value%2 == 1) System.out.println(value);
        }
    }
}
