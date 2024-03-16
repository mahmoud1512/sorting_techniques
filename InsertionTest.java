import org.example.GenerateArray;
import org.example.count_sort;
import org.example.insertion_sort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InsertionTest {
    GenerateArray generateArray = new GenerateArray();
    insertion_sort insertionSort = new insertion_sort();
    int[] arr = new int[1000000];
    int [] res = new int[1000000];
    @Test
    void InsertionSortTestRandomArrayOfSize10(){
        arr = generateArray.generateRandomArray(10);
        res = insertionSort.sort(arr);
        Arrays.sort(arr);
        assertArrayEquals(arr, res);
    }
    @Test
    void InsertionSortTestSortedArrayOfSize10(){
        arr = generateArray.generateSortedArray(arr);
        res = insertionSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test
    void InsertionSortTestSortedReversedArrayOfSize10(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = insertionSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test
    void InsertionSortTestRandomArrayOfSize100(){
        arr = generateArray.generateRandomArray(100);
        res = insertionSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test
    void InsertionSortTestSortedArrayOfSize100(){
        arr = generateArray.generateSortedArray(arr);
        res = insertionSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }


    @Test
    void InsertionSortTestSortedReversedArrayOfSize100(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = insertionSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test
    void InsertionSortTestRandomArrayOfSize1000(){
        arr = generateArray.generateRandomArray(1000);
        res = insertionSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test
    void InsertionSortTestSortedArrayOfSize1000(){
        arr = generateArray.generateSortedArray(arr);
        res = insertionSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test
    void InsertionSortTestSortedReversedArrayOfSize1000(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = insertionSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test
    void InsertionSortTestRandomArrayOfSize10000(){
        arr = generateArray.generateRandomArray(10000);
        res = insertionSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test
    void InsertionSortTestSortedArrayOfSize10000(){
        arr = generateArray.generateSortedArray(arr);
        res = insertionSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test
    void InsertionSortTestSortedReversedArrayOfSize10000(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = insertionSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test
    void InsertionSortTestRandomArrayOfSize100000(){
        arr = generateArray.generateRandomArray(100000);
        res = insertionSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test
    void InsertionSortTestSortedArrayOfSize100000(){
        arr = generateArray.generateSortedArray(arr);
        res = insertionSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test
    void InsertionSortTestSortedReversedArrayOfSize100000(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = insertionSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test
    void InsertionSortTestRandomArrayOfSize500000(){
        arr = generateArray.generateRandomArray(500000);
        res = insertionSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test
    void InsertionSortTestSortedArrayOfSize500000(){
        arr = generateArray.generateSortedArray(arr);
        res = insertionSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test
    void InsertionSortTestSortedReversedArrayOfSize500000(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = insertionSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test
    void InsertionSortTestRandomArrayOfSize800000(){
        arr = generateArray.generateRandomArray(800000);
        res = insertionSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test
    void InsertionSortTestSortedArrayOfSize800000(){
        arr = generateArray.generateSortedArray(arr);
        res = insertionSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test
    void InsertionSortTestSortedReversedArrayOfSize800000(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = insertionSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
}