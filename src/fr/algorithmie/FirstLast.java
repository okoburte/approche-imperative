package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        boolean firstLast = array.length > 0 && array[0] == array[array.length - 1];

        System.out.println(firstLast);
    }
}