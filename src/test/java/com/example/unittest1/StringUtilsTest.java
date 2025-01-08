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
}
