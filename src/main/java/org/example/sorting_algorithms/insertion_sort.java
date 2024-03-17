package org.example.sorting_algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class insertion_sort {
    private static final ArrayList<int[]> intermediate_results=new ArrayList<int[]>();

    public int[] sort(int[] array)
    {
        int size= array.length;
        for (int i = 1; i < size; i++) {
            int key=array[i];
            int k=i-1;
            while (k >= 0 && array[k] > key) {
                array[k + 1] = array[k];
                k = k - 1;
            }
            array[k + 1] = key;
            intermediate_results.add(array.clone());
        }
        return array;
    }

    public ArrayList<int[]> getIntermediate_results() {
        return intermediate_results;
    }
}
