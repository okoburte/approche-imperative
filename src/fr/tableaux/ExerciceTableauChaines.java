package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        String[] cityTab = {"Montpellier", "Paris", "Lyon", "Marseille", "Lilles"};

        for (int i = 0; i < cityTab.length; i++) {
            System.out.println(cityTab[i]);
        }

        System.out.println(cityTab.length);
        cityTab[3] = "Reims";

        // ce for loop a été proposé par l'IDE
        for (String s : cityTab) {
            System.out.println(s);
        }
    }
}
