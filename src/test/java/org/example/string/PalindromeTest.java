package org.example.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void testIsPalindromeForPositiveCase() {
        assertTrue(Palindrome.isPalindrome(121));
    }

    @Test
    void testIsPalindromeForNegativeCase() {
        assertFalse(Palindrome.isPalindrome(123));
    }

    @Test
    void testIsPalindromeForSingleDigit() {
        assertTrue(Palindrome.isPalindrome(7));
    }

    @Test
    void testIsPalindromeForNegativeNumber() {
        assertFalse(Palindrome.isPalindrome(-121));
    }
}