package org.andrey.complexityOfAlgorithms;

public class Algorithms {

    // O(1)
    static int getValue(int[] arr, int index) {
        return arr[index];
    }

    // O(log n)
    static int getIndex(int[] arr, int target) {
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
    static int getMaxValue(int[] arr) {
        int max = -1;
        for (int i : arr) {
            if (i > max) max = i;
        }
        return max;
    }

    // O(n^2)
    static long getSumAllOfPairs(int[] arr) {
        long max = 0;
        for (int j : arr) {
            for (int k : arr) {
                max += j + k;
            }
        }
        return max;
    }

    // O(2^n)
    static int fibonacci(int n) {
        if(n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // O(n!)
    public static class Permute {

        static void permute(int n, int[] array) {
            if(n > 1) {
                for(int i = 0; i < n-1; i++) {
                    permute(n - 1, array);
                    if(n % 2 == 0) {
                        swap(array, i, n-1);
                    } else {
                        swap(array, 0, n-1);
                    }
                }
                permute(n - 1, array);
            }
        }

        private static void swap(int[] array, int a, int b) {
            int tmp = array[a];
            array[a] = array[b];
            array[b] = tmp;
        }
    }
}
