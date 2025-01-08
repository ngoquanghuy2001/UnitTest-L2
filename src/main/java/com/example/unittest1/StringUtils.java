package com.example.unittest1;

public class StringUtils {

    // Method to reverse a string
    public static String reverse(String str) {
        if (str == null) throw new NullPointerException("Input string is null");
        return new StringBuilder(str).reverse().toString();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        if (str == null) throw new NullPointerException("Input string is null");
        String clean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }

    // Method to count the number of vowels in a string
    public static int countVowels(String str) {
        if (str == null) throw new NullPointerException("Input string is null");
        return (int) str.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) >= 0)
                .count();
    }
}
