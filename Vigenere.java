/*
Christine Yan
Cybersecurity Fall 2020
Period 5

Vigenere Cipher
*/

public class Vigenere {

    public static String vigenere(String text, String keytext, Boolean shift) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String txt = text.toUpperCase();
        String key = keytext.toUpperCase();
        String output = "";

        return output;
    }

    public static void main(String[] args) {
        String method = args[0];
        Boolean shift = method.equals("encode");
        String text = args[1];
        String keytext = args[2];

        System.out.println(vigenere(text, keytext, shift));
    }

}
