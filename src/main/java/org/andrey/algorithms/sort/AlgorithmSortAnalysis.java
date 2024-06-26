package org.andrey.algorithms.sort;

import java.util.Arrays;

import static org.andrey.algorithms.sort.AlgorithmsSort.*;

public class AlgorithmSortAnalysis {
    private static final int ARRAY_SIZE = 10_000;

    public static void main(String[] args) {
        bubbleSortPrint(); // O(n^2)
        selectionSortPrint(); // O(n^2)
        insertionSortPrint(); // O(n^2)
        quickSortPrint(); // O(n log n)
        mergeSortPrint(); // O(n log n)
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

    private static void insertionSortPrint() {
        int[] array = getRandomArray();
        long currentTime = System.currentTimeMillis();
        insertionSort(array);
        long leadTime = System.currentTimeMillis() - currentTime;
        System.out.printf("Execution time %dms\n %s\n", leadTime, Arrays.toString(array));
    }

    private static void quickSortPrint() {
        int[] array = getRandomArray();
        long currentTime = System.currentTimeMillis();
        quickSort(array, 0, array.length - 1);
        long leadTime = System.currentTimeMillis() - currentTime;
        System.out.printf("Execution time %dms\n %s\n", leadTime, Arrays.toString(array));
    }

    private static void mergeSortPrint() {
        int[] array = getRandomArray();
        long currentTime = System.currentTimeMillis();
        array = mergeSort(array);
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
