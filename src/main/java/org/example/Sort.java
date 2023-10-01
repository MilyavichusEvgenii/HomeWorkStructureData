package org.example;

public class Sort {
    private static void heapyfi(int[] array, int heapSize, int rootIndex){
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;
        if(leftChild < heapSize && array[leftChild] > array[largest]){
            largest = leftChild;
        }
        if(rightChild < heapSize && array[rightChild] > array[largest]){
            largest = rightChild;
        }
        if(largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;
            heapyfi(array, heapSize, largest);
        }
    }

    public static void heapSortedArr(int[] array){
        for (int i = array.length / 2 - 1; i >= 0 ; i--) {
            heapyfi(array, array.length, i);
        }

        for (int i = array.length - 1; i >= 0 ; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapyfi(array, i, 0);
        }
    }
}
