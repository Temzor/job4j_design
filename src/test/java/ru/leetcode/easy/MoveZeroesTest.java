package ru.leetcode.easy;

import org.junit.Test;

import java.util.Arrays;

public class MoveZeroesTest {
    @Test
    public void thenOneZero() {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] input = new int[] {0, 1, 3, 12};
        int[] expected  = new int[] {1, 3, 12, 0};
        Arrays.equals(expected, moveZeroes.moveZeroes(input));
    }

    @Test
    public void thenTwoZero() {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] input = new int[] {12, 1, 0, 8};
        int[] expected  = new int[] {12, 1, 8, 0};
        Arrays.equals(expected, moveZeroes.moveZeroes(input));
    }

    @Test
    public void thenOneElement() {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] input = new int[] {0};
        int[] expected  = new int[] {0};
        Arrays.equals(expected, moveZeroes.moveZeroes(input));
    }
}