package org.example;

import java.util.Random;

public class ArrayUtils {
    protected static Random random;

    public static int[] initArray(){
        random = new Random();
        int[] array = new int[random.nextInt(10, 100)];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-99, 100);
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int a:array) {
            System.out.print(a + "\t");
        }
    }

}
