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
}
