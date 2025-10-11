package com.pack;

public class Reversal {
    public static String reverseWithoutNumbers(String str) {

        if (str == null || str.isEmpty()) {
            return "";
        }
        if (str.length() == 1) {
            return str;
        }

        char[] reverseChars = str.toCharArray();

        for (int start = 0, end = reverseChars.length - 1; start < end; ) {
            if (Char.isLetter(reverseChars[start]) && Char.isLetter(reverseChars[end])) {
                char temp = reverseChars[start];
                reverseChars[start] = reverseChars[end];
                reverseChars[end] = temp;
                start++;
                end--;
            } else if (Char.isLetter(reverseChars[start]) && !Char.isLetter(reverseChars[end])) {
                end--;
            } else if (!Char.isLetter(reverseChars[start]) && Char.isLetter(reverseChars[end])) {
                start++;
            } else {
                start++;
                end--;
            }
        }

        return String.copyValueOf(reverseChars);
    }
}

class Char {
    static boolean isLetter(char character) {
        return ('A' <= character) && (character <= 'Z') || ('a' <= character) && (character <= 'z');
    }
}