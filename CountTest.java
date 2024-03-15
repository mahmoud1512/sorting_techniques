package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CountTest {
    GenerateArray generateArray = new GenerateArray();

    @Test
    void CountSortTestArrayOfSize10(){
        count_sort countSort = new count_sort();

        int [] arr = generateArray.generateRandomIntPositiveArray(10);
        int [] res = countSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    } @Test
    void CountSortTestArrayOfSize100(){
        count_sort countSort = new count_sort();

        int [] arr = generateArray.generateRandomIntPositiveArray(100);
        int [] res = countSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    } @Test
    void CountSortTestArrayOfSize1000(){
        count_sort countSort = new count_sort();

        int [] arr = generateArray.generateRandomIntPositiveArray(1000);
        int [] res = countSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test
    void CountSortTestArrayOfSize10000(){
        count_sort countSort = new count_sort();

        int [] arr = generateArray.generateRandomIntPositiveArray(10000);
        int [] res = countSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
}
