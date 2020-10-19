/*
Christine Yan
Cybersecurity Fall 2020
Period 5

Vigenere Cipher
*/

public class Vigenere {

    public static String vigenere(String text, String key, Boolean shift) {
        String output = "";
        text = text.toUpperCase();

        for (int i = 0, j = 0; i < text.length(); i++) {
            char curr = text.charAt(i);
            if (shift) {
                output += (char) ((curr + key.charAt(j) - 2 * 'A') % 26 + 'A');
            } else {
                output += (char) ((curr - key.charAt(i % key.length()) + 26) % 26 + 'A');
            }
            j = ++j % key.length();
        }
        return output;
    }

    public static void main(String[] args) {
        String method = args[0];
        Boolean shift = method.equals("encode");
        String text = args[1];
        String keytext = args[2];

        System.out.println(vigenere(text, keytext, shift));
    }

    /*
     * Test Case
     * $ java Vigenere encode HELLOWORLDCYBERSECURITY CHRISTINE
     * JLCTGPWEPFJPJWKARGWYZBQ
     *
     * $ java Vigenere decode JLCTGPWEPFJPJWKARGWYZBQ CHRISTINE
     * HELLOWORLDCYBERSECURITY
     */

}
