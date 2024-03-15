package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeTest {
    GenerateArray generateArray = new GenerateArray();
    merge_sort mergeSort = new merge_sort();

    @Test
    void MergeSortTestArrayOfSize10(){
        int [] arr = generateArray.generateRandomArray(10);
        int [] res = mergeSort.sort(arr, 0, arr.length);

        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test
    void MergeSortTestArrayOfSize100(){
        int [] arr = generateArray.generateRandomArray(100);
        int [] res = mergeSort.sort(arr, 0, arr.length);

        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }@Test
    void MergeSortTestArrayOfSize1000(){
        int [] arr = generateArray.generateRandomArray(1000);
        int [] res = mergeSort.sort(arr, 0, arr.length);

        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }@Test
    void MergeSortTestArrayOfSize10000(){
        int [] arr = generateArray.generateRandomArray(10000);
        int [] res = mergeSort.sort(arr, 0, arr.length);

        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test
    void MergeSortTestArrayOfSize100000(){
        int [] arr = generateArray.generateRandomArray(100000);
        int [] res = mergeSort.sort(arr, 0, arr.length);

        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
}
