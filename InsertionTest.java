package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InsertionTest {
    GenerateArray generateArray = new GenerateArray();

    @Test
    void InsertionSortTestArrayOfSize10(){
        insertion_sort insertionSort = new insertion_sort();

        int [] arr = generateArray.generateRandomArray(10);
        int [] res = insertionSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
  @Test
    void InsertionSortTestArrayOfSize100(){
        insertion_sort insertionSort = new insertion_sort();

        int [] arr = generateArray.generateRandomArray(10);
        int [] res = insertionSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);

  }
  @Test
    void InsertionSortTestArrayOfSize1000(){
        insertion_sort insertionSort = new insertion_sort();

        int [] arr = generateArray.generateRandomArray(10);
        int [] res = insertionSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);

  }
  @Test
    void InsertionSortTestArrayOfSize10000(){
        insertion_sort insertionSort = new insertion_sort();

        int [] arr = generateArray.generateRandomArray(10);
        int [] res = insertionSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);

  }
  @Test
    void InsertionSortTestArrayOfSize100000() {
      insertion_sort insertionSort = new insertion_sort();

      int[] arr = generateArray.generateRandomArray(10);
      int[] res = insertionSort.sort(arr);
      Arrays.sort(arr);

      assertArrayEquals(arr, res);

  }
}