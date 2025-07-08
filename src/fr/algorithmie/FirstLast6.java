package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, 6};
        boolean firstLast6 = array.length > 0 && (array[0] == 6 || array[array.length - 1] == 6);

        System.out.println(firstLast6);
    }
}
