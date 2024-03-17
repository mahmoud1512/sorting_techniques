package org.example;
import java.util.Arrays;
import java.util.Random;

public class GenerateArray {
    private int[] reverse(int[] array){
        int size = array.length;
        for (int i = 0; i <= array.length / 2; i++) {
            int t = array[i];
            array[i] = array[size - i - 1];
            array[size - i - 1] = t;
        }
        return array;
    }
    public int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }
    public int[] generateRandomPositiveArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000001);
        }
        return array;
    }

    public int[] generateSortedArray(int[] array){
        Arrays.sort(array);
        return array;
    }

    public int[] generateSortedReversedArray(int[] array){
        return reverse(generateSortedArray(array));
    }

}
