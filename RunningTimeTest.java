package org.example;

import org.junit.Test;

public class RunningTimeTest {

    @Test(timeout = 1000) // Timeout in milliseconds
    public void testInsertionSortRunningTimeSize100() {
        GenerateArray generateArray = new GenerateArray();
        int[] arr = generateArray.generateRandomArray(100);
        insertion_sort insertionSort = new insertion_sort();
        insertionSort.sort(arr);
    }

    @Test(timeout = 1000) // Timeout in milliseconds
    public void testMergeSortRunningTimeSize100() {
        GenerateArray generateArray = new GenerateArray();
        int[] arr = generateArray.generateRandomArray(100);
        merge_sort mergeSort = new merge_sort();
        mergeSort.sort(arr, 0, arr.length);
    }

    @Test(timeout = 1000) // Timeout in milliseconds
    public void testCountSortRunningTimeSize100() {
        GenerateArray generateArray = new GenerateArray();
        int[] arr = generateArray.generateRandomIntPositiveArray(100);
        count_sort countSort = new count_sort();
        countSort.sort(arr);
    }

    @Test(timeout = 1000) // Timeout in milliseconds
    public void testInsertionSortRunningTimeSize1000() {
        GenerateArray generateArray = new GenerateArray();
        int[] arr = generateArray.generateRandomArray(1000);
        insertion_sort insertionSort = new insertion_sort();
        insertionSort.sort(arr);
    }

    @Test(timeout = 1000) // Timeout in milliseconds
    public void testMergeSortRunningTimeSize1000() {
        GenerateArray generateArray = new GenerateArray();
        int[] arr = generateArray.generateRandomArray(1000);
        merge_sort mergeSort = new merge_sort();
        mergeSort.sort(arr, 0, arr.length);
    }

    @Test(timeout = 1000) // Timeout in milliseconds
    public void testCountSortRunningTimeSize1000() {
        GenerateArray generateArray = new GenerateArray();
        int[] arr = generateArray.generateRandomIntPositiveArray(1000);
        count_sort countSort = new count_sort();
        countSort.sort(arr);
    }

    @Test(timeout = 1000) // Timeout in milliseconds
    public void testInsertionSortRunningTimeSize10000() {
        GenerateArray generateArray = new GenerateArray();
        int[] arr = generateArray.generateRandomArray(10000);
        insertion_sort insertionSort = new insertion_sort();
        insertionSort.sort(arr);
    }

    @Test(timeout = 1000) // Timeout in milliseconds
    public void testMergeSortRunningTimeSize10000() {
        GenerateArray generateArray = new GenerateArray();
        int[] arr = generateArray.generateRandomArray(10000);
        merge_sort mergeSort = new merge_sort();
        mergeSort.sort(arr, 0, arr.length);
    }

    @Test(timeout = 1000) // Timeout in milliseconds
    public void testCountSortRunningTimeSize10000() {
        GenerateArray generateArray = new GenerateArray();
        int[] arr = generateArray.generateRandomIntPositiveArray(10000);
        count_sort countSort = new count_sort();
        countSort.sort(arr);
    }

    @Test(timeout = 1000) // Timeout in milliseconds
    public void testInsertionSortRunningTimeSize100000() {
        GenerateArray generateArray = new GenerateArray();
        int[] arr = generateArray.generateRandomArray(100000);
        insertion_sort insertionSort = new insertion_sort();
        insertionSort.sort(arr);
    }

    @Test(timeout = 1000) // Timeout in milliseconds
    public void testMergeSortRunningTimeSize100000() {
        GenerateArray generateArray = new GenerateArray();
        int[] arr = generateArray.generateRandomArray(100000);
        merge_sort mergeSort = new merge_sort();
        mergeSort.sort(arr, 0, arr.length);
    }

    @Test(timeout = 1000) // Timeout in milliseconds
    public void testCountSortRunningTimeSize100000() {
        GenerateArray generateArray = new GenerateArray();
        int[] arr = generateArray.generateRandomIntPositiveArray(100000);
        count_sort countSort = new count_sort();
        countSort.sort(arr);
    }
}