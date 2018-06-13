package com.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    public void small_K_Less_than_N() {
        int[] A = {1, 2, 3, 4, 5};
        Solution solution = new Solution();
        assertArrayEquals(new int[]{4, 5, 1, 2, 3}, solution.solution(A, 2));
    }

    @Test
    public void empty() {
        int[] A = {};
        Solution solution = new Solution();
        assertArrayEquals(A, solution.solution(A, 10));
    }

    @Test
    public void single() {
        int[] A = {1};
        Solution solution = new Solution();
        assertArrayEquals(new int[]{1}, solution.solution(A, 3));
    }

    @Test
    public void small_K_More_than_N() {
        int[] A = {1, 2, 3};
        Solution solution = new Solution();
        assertArrayEquals(new int[]{2, 3, 1}, solution.solution(A, 5));
    }

    @Test
    public void small_K_Less_than_N_2() {
        int[] A = {3, 4, 5, 6, 7, 1, 2};
        Solution solution = new Solution();
        assertArrayEquals(new int[]{6, 7, 1, 2, 3, 4, 5}, solution.solution(A, 4));
    }

    @Test
    public void small_K_equals_to_N() {
        int[] A = {3, 4, 5, 6, 7, 1, 2};
        Solution solution = new Solution();
        assertArrayEquals(new int[]{3, 4, 5, 6, 7, 1, 2}, solution.solution(A, 7));
    }
}