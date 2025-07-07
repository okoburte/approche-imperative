package fr.declaration.variable;

public class DeclarationApp {

    public static void main(String[] args) {
        byte varByte = 42;
        short varShort = 1042;
        int varInt = 2042000;
        long varLong = 424242424;
        float varFloat = 3.14f;
        double varDouble = 1.23456;
        char varChar = 'J';
        boolean varBoolean = true;
        String varString = "Je suis une chaine de caractere";

        System.out.println(varByte);
        System.out.println(varShort);
        System.out.println(varInt);
        System.out.println(varLong);
        System.out.println(varFloat);
        System.out.println(varDouble);
        System.out.println(varChar);
        System.out.println(varBoolean);
        System.out.println(varString);

        String randomString = "Voici le resultat d'un calcul :\n1+5=6";
        System.out.println(randomString);
    }
}
