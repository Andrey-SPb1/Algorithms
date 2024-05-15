package org.andrey.algorithms.sort;

import java.util.Arrays;

import static org.andrey.algorithms.sort.AlgorithmSort.bubbleSort;
import static org.andrey.algorithms.sort.AlgorithmSort.selectionSort;

public class AlgorithmSortAnalysis {
    private static final int ARRAY_SIZE = 100;

    public static void main(String[] args) {
//        int[] array = {4, 7, 5, 8, 1, 3, 6, 9, 0, 2};

        selectionSortPrint();

        bubbleSortPrint();
    }

    private static void bubbleSortPrint() {
        int[] array = getRandomArray();
        long currentTime = System.currentTimeMillis();
        bubbleSort(array);
        long leadTime = System.currentTimeMillis() - currentTime;
        System.out.printf("Execution time %dms\n %s\n", leadTime, Arrays.toString(array));
    }

    private static void selectionSortPrint() {
        int[] array = getRandomArray();
        long currentTime = System.currentTimeMillis();
        selectionSort(array);
        long leadTime = System.currentTimeMillis() - currentTime;
        System.out.printf("Execution time %dms\n %s\n", leadTime, Arrays.toString(array));
    }

    private static int[] getRandomArray() {
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

}
