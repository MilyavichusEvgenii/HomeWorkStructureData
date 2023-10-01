package org.example;

public class Main {
    public static void main(String[] args) {
        int[] array = ArrayUtils.initArray();
        ArrayUtils.printArray(array);
        Sort.heapSortedArr(array);
        System.out.println();
        ArrayUtils.printArray(array);
    }
}