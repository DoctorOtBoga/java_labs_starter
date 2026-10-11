package edu.course.lab01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CourseToolkitTest {

    @Test
    void returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(8);

        assertTrue(result);
    }

    @Test
    void returnsFalseForOddNumber() {
        boolean result = CourseToolkit.isEven(7);

        assertFalse(result);
    }

    @Test
    void returnsTrueForZero() {
        boolean result = CourseToolkit.isEven(0);

        assertTrue(result);
    }

    @Test
    void returnsTrueForNegativeEvenNumber() {
        boolean result = CourseToolkit.isEven(-8);

        assertTrue(result);
    }

    @Test
    void returnsTrueForPalindrome() {
        boolean result = CourseToolkit.isPalindrome("шалаш");
        assertTrue(result);
    }

    @Test
    void returnsFalseWhenCaseDiffers() {
        boolean result = CourseToolkit.isPalindrome("Радар");
        assertFalse(result);
    }

    @Test
    void throwsIllegalArgumentExceptionWhenTextIsNull() {
        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.isPalindrome(null));
    }

    @Test
    void returnsFalseForNegativePrime() {
        boolean result = CourseToolkit.isPrime(-5);

        assertFalse(result);
    }

    @Test
    void returnsTrueFor2Prime() {
        boolean result = CourseToolkit.isPrime(2);

        assertTrue(result);
    }

    @Test
    void returnsFalseForSimplePrime() {
        boolean result = CourseToolkit.isPrime(10);

        assertFalse(result);
    }

    @Test
    void returnsFalseForSimpleSquarePrime() {
        boolean result = CourseToolkit.isPrime(49);

        assertFalse(result);
    }

    @Test
    void calculatesAverageForPositiveNumbers() {
        double result = CourseToolkit.average(new int[]{1, 4, 6, 10, 12});

        assertEquals(6.6, result, 1e-9);
    }

    @Test
    void calculatesAverageForNegativeNumbers() {
        double result = CourseToolkit.average(new int[]{-2, -5, -7, -10, -11});

        assertEquals(-7.0, result, 1e-9);
    }

    @Test
    void throwsIllegalArgumentExceptionWhenArrayIsNull() {
        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.average(null));
    }

    @Test
    void throwsIllegalArgumentExceptionWhenArrayIsEmpty() {
        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.average(new int[0]));
    }
}