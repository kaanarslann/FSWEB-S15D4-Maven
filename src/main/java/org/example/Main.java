package org.example;


import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
    }

    public static boolean checkForPalindrome(String input){
        String regex = "[.,!?\"+'\\-–—]";
        String newText = input.replaceAll(regex, "").replaceAll(" ", "").toLowerCase(Locale.ENGLISH).trim();
        System.out.println(newText);

        String reversedText = "";
        for (int i = 0; i < newText.length(); i++) {
            reversedText = newText.charAt(i) + reversedText;
        }
        System.out.println(reversedText);

        if (newText.equals(reversedText)){
            return true;
        } else {
            return false;
        }
    }

    public static String convertDecimalToBinary(int input) {
        String reverseBinary = "";
        while(input > 0){
            int remainder = input % 2;
            reverseBinary += Integer.toString(remainder);
            input /= 2;
        }
        String binary = "";
        for (int i = 0; i < reverseBinary.length(); i++) {
            binary = reverseBinary.charAt(i) + binary;
        }
        return binary;
    }
}