package com.pack.util;

public class StringUtil {
    public static String reverseLetter(String str) {

        if (str == null || str.isEmpty()) {
            return "";
        }
        if (str.length() == 1) {
            return str;
        }

        char[] reverseChars = str.toCharArray();
        int start = 0;
        int end = reverseChars.length - 1;

        while (start < end) {
            if (Character.isLetter(reverseChars[start]) && Character.isLetter(reverseChars[end])) {
                char temp = reverseChars[start];
                reverseChars[start] = reverseChars[end];
                reverseChars[end] = temp;
                start++;
                end--;
            } else if (Character.isLetter(reverseChars[start]) && !Character.isLetter(reverseChars[end])) {
                end--;
            } else if (!Character.isLetter(reverseChars[start]) && Character.isLetter(reverseChars[end])) {
                start++;
            } else {
                start++;
                end--;
            }
        }

        return String.copyValueOf(reverseChars);
    }
}
