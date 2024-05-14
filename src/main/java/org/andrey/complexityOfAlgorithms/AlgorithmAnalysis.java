package org.andrey.complexityOfAlgorithms;

import static org.andrey.complexityOfAlgorithms.Algorithms.*;

public class AlgorithmAnalysis {

    private static final int ARRAY_SIZE = 100_000;

    public static void main(String[] args) {
        int[] array = getArray();
        int[] randomArray = getRandomArray();

        constantPrint(randomArray, (int) (Math.random() * 100)); // get value by index
        logarithmicPrint(array, (int) (Math.random() * 100) + 1); // get index by value
        linearPrint(randomArray); // get max value
        quadraticPrint(randomArray); // get sum of all pairs
        exponentialPrint((int) (Math.random() * 30)); // Fibonacci numbers
    }

    private static int[] getArray() {
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    private static int[] getRandomArray() {
        int[] arrays = new int[ARRAY_SIZE];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) (Math.random() * 100);
        }
        return arrays;
    }

    private static void logarithmicPrint(int[] arrays, int target) {
        long currentTime = System.currentTimeMillis();
        int result = logarithmic(arrays, target);
        long leadTime = System.currentTimeMillis() - currentTime;
        System.out.printf("O(log n) Logarithmic --- Execution time %dms --- Result %d\n",
                leadTime, result);
    }

    private static void constantPrint(int[] arrays, int index) {
        long currentTime = System.currentTimeMillis();
        int result = constant(arrays, index);
        long leadTime = System.currentTimeMillis() - currentTime;
        System.out.printf("O(1) Constant --- Execution time %dms --- Result %d\n",
                leadTime, result);
    }

    private static void linearPrint(int[] arrays) {
        long currentTime = System.currentTimeMillis();
        int result = linear(arrays);
        long leadTime = System.currentTimeMillis() - currentTime;
        System.out.printf("O(n) Linear --- Execution time %dms --- Result %d\n",
                leadTime, result);
    }

    private static void quadraticPrint(int[] arrays) {
        long currentTime = System.currentTimeMillis();
        long result = quadratic(arrays);
        long leadTime = System.currentTimeMillis() - currentTime;
        System.out.printf("O(n^2) Quadratic --- Execution time %dms --- Result %d\n",
                leadTime, result);
    }

    private static void exponentialPrint(int n) {
        long currentTime = System.currentTimeMillis();
        long result = exponential(n);
        long leadTime = System.currentTimeMillis() - currentTime;
        System.out.printf("O(2^n) Exponential --- Execution time %dms --- Result %d\n",
                leadTime, result);
    }



}
