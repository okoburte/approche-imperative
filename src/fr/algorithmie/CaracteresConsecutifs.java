package fr.algorithmie;

public class CaracteresConsecutifs {
    public static void main(String[] args) {
        String text = "aaabbcc";
        StringBuilder textConsec = new StringBuilder();
        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            if (i == 0) {
                textConsec = new StringBuilder(String.valueOf(text.charAt(0)));
                counter = 1;
            }
            else {
                if (textConsec.charAt(textConsec.length()-1) == text.charAt(i)) counter ++;
                else {
                    textConsec.append(counter).append(text.charAt(i));
                    counter = 1;
                }
            }
        }
        textConsec.append(counter);

        System.out.println(textConsec);
    }
}
