package org.andrey.algorithms.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] values = new int[] {3, 8, 9, 1, 4, 7, 5, 2, 6};
        sort(values);
        System.out.println(Arrays.toString(values));
    }

    private static void sort(int[] values) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 0; i < values.length - 1; i++) {
                if(values[i] > values[i+1]) {
                    int swap = values[i];
                    values[i] = values[i+1];
                    values[i+1] = swap;
                    needIteration = true;
                }
            }
        }
    }
}
