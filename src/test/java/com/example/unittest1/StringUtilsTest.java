package com.example.unittest1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    // Tests for reverse method
    @Test
    public void testReverseWithNormalString() {
        assertEquals("tset", StringUtils.reverse("test"));
    }

    @Test
    public void testReverseWithEmptyString() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    public void testReverseWithNull() {
        assertThrows(NullPointerException.class, () -> {
            StringUtils.reverse(null);
        });
    }

    @Test
    public void testReverseWithSpecialCharacters() {
        assertEquals("!@#$", StringUtils.reverse("$#@!"));
    }

    @Test
    public void testReverseWithUnicode() {
        assertEquals("界世好你", StringUtils.reverse("你好世界"));
    }

    // Tests for isPalindrome method
    @Test
    public void testIsPalindromeWithSimplePalindrome() {
        assertTrue(StringUtils.isPalindrome("madam"));
    }

    @Test
    public void testIsPalindromeWithMixedCase() {
        assertTrue(StringUtils.isPalindrome("MadAm"));
    }

    @Test
    public void testIsPalindromeWithSpecialCharacters() {
        assertTrue(StringUtils.isPalindrome("A man, a plan, a canal, Panama"));
    }

    @Test
    public void testIsPalindromeWithEmptyString() {
        assertTrue(StringUtils.isPalindrome(""));
    }

    @Test
    public void testIsPalindromeWithNull() {
        assertThrows(NullPointerException.class, () -> {
            StringUtils.isPalindrome(null);
        });
    }

    @Test
    public void testIsPalindromeWithNonPalindrome() {
        assertFalse(StringUtils.isPalindrome("hello"));
    }

    // Tests for countVowels method
    @Test
    public void testCountVowelsWithNormalString() {
        assertEquals(2, StringUtils.countVowels("hello"));
    }

    @Test
    public void testCountVowelsWithAllVowels() {
        assertEquals(10, StringUtils.countVowels("aeiouAEIOU"));
    }

    @Test
    public void testCountVowelsWithNoVowels() {
        assertEquals(0, StringUtils.countVowels("bcdfg"));
    }

    @Test
    public void testCountVowelsWithEmptyString() {
        assertEquals(0, StringUtils.countVowels(""));
    }

    @Test
    public void testCountVowelsWithNull() {
        assertThrows(NullPointerException.class, () -> {
            StringUtils.countVowels(null);
        });
    }

    @Test
    public void testCountVowelsWithSpecialCharacters() {
        assertEquals(0, StringUtils.countVowels("@#$%^&*()"));
    }

    // Tests for reverse method
    @Test
    public void testReverseWithSingleCharacter() {
        assertEquals("a", StringUtils.reverse("a"));
    }

    @Test
    public void testReverseWithSpacesOnly() {
        assertEquals("   ", StringUtils.reverse("   "));
    }

    @Test
    public void testReverseWithNumbers() {
        assertEquals("321", StringUtils.reverse("123"));
    }

    @Test
    public void testReverseWithAlphanumeric() {
        assertEquals("321cba", StringUtils.reverse("abc123"));
    }

    @Test
    public void testReverseWithSpecialAndAlphanumeric() {
        assertEquals("!321cba@", StringUtils.reverse("@abc123!"));
    }

    @Test
    public void testReverseWithLongString() {
        String input = "abcdefghijklmnopqrstuvwxyz";
        String expected = "zyxwvutsrqponmlkjihgfedcba";
        assertEquals(expected, StringUtils.reverse(input));
    }

    // Tests for isPalindrome method
    @Test
    public void testIsPalindromeWithNumbers() {
        assertTrue(StringUtils.isPalindrome("12321"));
    }

    @Test
    public void testIsPalindromeWithSpaces() {
        assertTrue(StringUtils.isPalindrome("  "));
    }

    @Test
    public void testIsPalindromeWithNonPalindromeNumbers() {
        assertFalse(StringUtils.isPalindrome("12345"));
    }

    @Test
    public void testIsPalindromeWithUnicodeCharacters() {
        assertTrue(StringUtils.isPalindrome("あいういあ"));
    }

    @Test
    public void testIsPalindromeWithSpecialCharactersOnly() {
        assertTrue(StringUtils.isPalindrome("!!@@!!"));
    }

    @Test
    public void testIsPalindromeWithNonAlphanumericCharacters() {
        assertTrue(StringUtils.isPalindrome("!a!"));
    }

    // Tests for countVowels method
    @Test
    public void testCountVowelsWithMixedCaseVowels() {
        assertEquals(2, StringUtils.countVowels("hEllO"));
    }

    @Test
    public void testCountVowelsWithNumbersAndVowels() {
        assertEquals(5, StringUtils.countVowels("123aeiou123"));
    }

    @Test
    public void testCountVowelsWithSpaces() {
        assertEquals(5, StringUtils.countVowels("a e i o u"));
    }

    @Test
    public void testCountVowelsWithSpecialCharactersAndVowels() {
        assertEquals(5, StringUtils.countVowels("a!e@i#o$u%"));
    }

    @Test
    public void testCountVowelsWithUnicodeCharacters() {
        assertEquals(0, StringUtils.countVowels("你好世界")); // No vowels in these characters
    }

    @Test
    public void testCountVowelsWithVietnameseCharacters() {
        assertEquals(4, StringUtils.countVowels("Xin chào thế giới!"));
    }

    @Test
    public void testCountVowelsWithRepeatingVowels() {
        assertEquals(10, StringUtils.countVowels("aeiouaeiou"));
    }

    @Test
    public void testCountVowelsWithLongString() {
        String longString = "abcdefghijklmnopqrstuvwxyz" +
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                "1234567890!@#$%^&*()";
        assertEquals(10, StringUtils.countVowels(longString)); // 10 vowels in total
    }
}
