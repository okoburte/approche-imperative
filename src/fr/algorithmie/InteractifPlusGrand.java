package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int plusGrand = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Nombre " + (i + 1) + " :");
            if (i == 0) plusGrand = scanner.nextInt();
            else plusGrand = Math.max(scanner.nextInt(), plusGrand);
        }

        System.out.println("Le nombre le plus grand donné est : " + plusGrand);
    }
}
