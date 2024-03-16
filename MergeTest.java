import org.example.GenerateArray;
import org.example.insertion_sort;
import org.example.merge_sort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeTest {
    GenerateArray generateArray = new GenerateArray();
    merge_sort mergeSort = new merge_sort();
    int[] arr = new int[1000000];
    int [] res = new int[1000000];
    @Test
    void MergeSortTestRandomArrayOfSize10(){
        arr = generateArray.generateRandomArray(10);
        res = mergeSort.sort(arr, 0, arr.length);
        Arrays.sort(arr);
        assertArrayEquals(arr, res);
    }
    @Test
    void MergeSortTestSortedArrayOfSize10(){
        arr = generateArray.generateSortedArray(arr);
        res = mergeSort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test
    void MergeSortTestSortedReversedArrayOfSize10(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = mergeSort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test
    void MergeSortTestRandomArrayOfSize100(){
        arr = generateArray.generateRandomArray(100);
        res = mergeSort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test
    void MergeSortTestSortedArrayOfSize100(){
        arr = generateArray.generateSortedArray(arr);
        res = mergeSort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }


    @Test
    void MergeSortTestSortedReversedArrayOfSize100(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = mergeSort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test
    void MergeSortTestRandomArrayOfSize1000(){
        arr = generateArray.generateRandomArray(1000);
        res = mergeSort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test
    void MergeSortTestSortedArrayOfSize1000(){
        arr = generateArray.generateSortedArray(arr);
        res = mergeSort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test
    void MergeSortTestSortedReversedArrayOfSize1000(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = mergeSort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test
    void MergeSortTestRandomArrayOfSize10000(){
        arr = generateArray.generateRandomArray(10000);
        res = mergeSort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test
    void MergeSortTestSortedArrayOfSize10000(){
        arr = generateArray.generateSortedArray(arr);
        res = mergeSort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test
    void MergeSortTestSortedReversedArrayOfSize10000(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = mergeSort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test
    void MergeSortTestRandomArrayOfSize100000(){
        arr = generateArray.generateRandomArray(100000);
        res = mergeSort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test
    void MergeSortTestSortedArrayOfSize100000(){
        arr = generateArray.generateSortedArray(arr);
        res = mergeSort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test
    void MergeSortTestSortedReversedArrayOfSize100000(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = mergeSort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test
    void MergeSortTestRandomArrayOfSize500000(){
        arr = generateArray.generateRandomArray(500000);
        res = mergeSort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test
    void MergeSortTestSortedArrayOfSize500000(){
        arr = generateArray.generateSortedArray(arr);
        res = mergeSort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test
    void MergeSortTestSortedReversedArrayOfSize500000(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = mergeSort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test
    void MergeSortTestRandomArrayOfSize800000(){
        arr = generateArray.generateRandomArray(800000);
        res = mergeSort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test
    void MergeSortTestSortedArrayOfSize800000(){
        arr = generateArray.generateSortedArray(arr);
        res = mergeSort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test
    void MergeSortTestSortedReversedArrayOfSize800000(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = mergeSort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
}
