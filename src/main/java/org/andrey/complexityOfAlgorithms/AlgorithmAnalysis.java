package org.andrey.complexityOfAlgorithms;

import static org.andrey.complexityOfAlgorithms.Algorithms.*;
import static org.andrey.complexityOfAlgorithms.Algorithms.Permute.permute;

public class AlgorithmAnalysis {

    private static final int ARRAY_SIZE = 100_000;

    public static void main(String[] args) {
        int[] array = getArray();
        int[] randomArray = getRandomArray();

        constantPrint(randomArray, (int) (Math.random() * 100)); // get value by index
        logarithmicPrint(array, (int) (Math.random() * 100) + 1); // get index by value
        linearPrint(randomArray); // get max value
        quadraticPrint(randomArray); // get sum of all pairs
        exponentialPrint(30); // Fibonacci numbers
        factorialPrint(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}); // Permutations all elements
    }

    private static int[] getArray() {
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    private static int[] getRandomArray() {
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    private static void logarithmicPrint(int[] array, int target) {
        long currentTime = System.currentTimeMillis();
        int result = getIndex(array, target);
        long leadTime = System.currentTimeMillis() - currentTime;
        System.out.printf("O(log n) Logarithmic --- Execution time %dms --- Result %d\n",
                leadTime, result);
    }

    private static void constantPrint(int[] array, int index) {
        long currentTime = System.currentTimeMillis();
        int result = getValue(array, index);
        long leadTime = System.currentTimeMillis() - currentTime;
        System.out.printf("O(1) Constant --- Execution time %dms --- Result %d\n",
                leadTime, result);
    }

    private static void linearPrint(int[] array) {
        long currentTime = System.currentTimeMillis();
        int result = getMaxValue(array);
        long leadTime = System.currentTimeMillis() - currentTime;
        System.out.printf("O(n) Linear --- Execution time %dms --- Result %d\n",
                leadTime, result);
    }

    private static void quadraticPrint(int[] array) {
        long currentTime = System.currentTimeMillis();
        long result = getSumAllOfPairs(array);
        long leadTime = System.currentTimeMillis() - currentTime;
        System.out.printf("O(n^2) Quadratic --- Execution time %dms --- Result %d\n",
                leadTime, result);
    }

    private static void exponentialPrint(int n) {
        long currentTime = System.currentTimeMillis();
        long result = fibonacci(n);
        long leadTime = System.currentTimeMillis() - currentTime;
        System.out.printf("O(2^n) Exponential --- Execution time %dms --- Result %d\n",
                leadTime, result);
    }

    private static void factorialPrint(int[] array) {
        long currentTime = System.currentTimeMillis();
        permute(array.length, array);
        long leadTime = System.currentTimeMillis() - currentTime;
        System.out.printf("O(n!) Factorial --- Execution time %dms\n", leadTime);
    }
}
