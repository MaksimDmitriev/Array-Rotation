package com.app;

public class Solution {

    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        final int N = A.length;
        if (N == 0) {
            return A;
        }

        K %= N;
        int[] buffer = new int[N - K];

        // save the head to buffer
        int j = 0;
        for (int i = 0; i < N - K; i++) {
            buffer[j++] = A[i];
        }

        // move the tail to the beginning of A
        int m = 0;
        for (int i = N - K; i < N; i++) {
            A[m++] = A[i];
        }

        // fill the tail from buffer
        for (int i = 0; i < buffer.length; i++) {
            A[i + K] = buffer[i];
        }

        return A;
    }
}
