package org.andrey.algorithms.sort;

public class AlgorithmSort {

    static void bubbleSort(int[] array) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i+1]) {
                    int swap = array[i];
                    array[i] = array[i+1];
                    array[i+1] = swap;
                    needIteration = true;
                }
            }
        }
    }

    static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minInd = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    minInd = j;
                    min = array[j];
                }
            }
            array[minInd] = array[i];
            array[i] = min;
        }
    }

    static void insertionSort(int[] sortArr) {
        int j;
        for (int i = 1; i < sortArr.length; i++) {
            int swap = sortArr[i];
            for (j = i; j > 0 && swap < sortArr[j - 1]; j--) {
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
        }
    }
}
