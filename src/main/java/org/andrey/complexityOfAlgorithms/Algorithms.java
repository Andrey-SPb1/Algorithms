package org.andrey.complexityOfAlgorithms;

public class Algorithms {

    // O(1)
    static int constant(int[] arr, int index) {
        return arr[index];
    }

    // O(log n)
    static int logarithmic(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // not found
    }

    // O(n)
    static int linear(int[] arr) {
        int max = -1;
        for (int i : arr) {
            if (i > max) max = i;
        }
        return max;
    }

    // O(n^2)
    static long quadratic(int[] arr) {
        long max = 0;
        for (int j : arr) {
            for (int k : arr) {
                max += j + k;
            }
        }
        return max;
    }

    // O(2^n)
    static int exponential(int n) {
        if(n <= 1) {
            return n;
        } else {
            return exponential(n - 1) + exponential(n - 2);
        }
    }
}
