package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerArray;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void letterCombinations() {
        ArrayList<String> exp = Solution.letterCombinations("23");
        ArrayList<String> res = Solution.letterCombinations("23");
        assertEquals(exp, res);
    }

    @Test
    void twoSum() {
        ArrayList<Integer> answ = new ArrayList<Integer>();
        answ.add(2);
        answ.add(4);
        answ.add(6);
        answ.add(8);
        answ.add(10);
        ArrayList<Integer> exp = Solution.twoSum(answ, 10);
        ArrayList<Integer> res = Solution.twoSum(answ, 10);
        assertEquals(exp, res);
    }

    @Test
    void isPalindrome() {
        boolean exp = Solution.isPalindrome(121);
        boolean res = Solution.isPalindrome(121);
        assertEquals(exp, res);
    }
}