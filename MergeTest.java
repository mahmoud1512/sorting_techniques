import org.example.GenerateArray;
import org.example.merge_sort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class MergeTest {
    GenerateArray generateArray = new GenerateArray();
    merge_sort mergeSort = new merge_sort();
    int[] arr = new int[1000000];
    int [] res = new int[1000000];

    @Test(timeout = 1000)
    public void MergeSortTestRandomArrayOfSize10(){
        arr = generateArray.generateRandomArray(10);
        res = merge_sort.sort(arr, 0, arr.length);
        Arrays.sort(arr);
        assertArrayEquals(arr, res);
    }
    @Test(timeout = 1000)
    public void MergeSortTestSortedArrayOfSize10(){
        arr = generateArray.generateSortedArray(arr);
        res = merge_sort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test(timeout = 1000)
    public void MergeSortTestSortedReversedArrayOfSize10(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = merge_sort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test(timeout = 1000)
    public void MergeSortTestRandomArrayOfSize100(){
        arr = generateArray.generateRandomArray(100);
        res = merge_sort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test(timeout = 1000)
    public void MergeSortTestSortedArrayOfSize100(){
        arr = generateArray.generateSortedArray(arr);
        res = merge_sort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }


    @Test(timeout = 1000)
    public void MergeSortTestSortedReversedArrayOfSize100(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = merge_sort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test(timeout = 1000)
    public void MergeSortTestRandomArrayOfSize1000(){
        arr = generateArray.generateRandomArray(1000);
        res = merge_sort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test(timeout = 1000)
    public void MergeSortTestSortedArrayOfSize1000(){
        arr = generateArray.generateSortedArray(arr);
        res = merge_sort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test(timeout = 1000)
    public void MergeSortTestSortedReversedArrayOfSize1000(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = merge_sort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test(timeout = 1000)
    public void MergeSortTestRandomArrayOfSize10000(){
        arr = generateArray.generateRandomArray(10000);
        res = merge_sort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test(timeout = 1000)
    public void MergeSortTestSortedArrayOfSize10000(){
        arr = generateArray.generateSortedArray(arr);
        res = merge_sort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test(timeout = 1000)
    public void MergeSortTestSortedReversedArrayOfSize10000(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = merge_sort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test(timeout = 1000)
    public void MergeSortTestRandomArrayOfSize100000(){
        arr = generateArray.generateRandomArray(100000);
        res = merge_sort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test(timeout = 1000)
    public void MergeSortTestSortedArrayOfSize100000(){
        arr = generateArray.generateSortedArray(arr);
        res = merge_sort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test(timeout = 1000)
    public void MergeSortTestSortedReversedArrayOfSize100000(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = merge_sort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test(timeout = 1000)
    public void MergeSortTestRandomArrayOfSize500000(){
        arr = generateArray.generateRandomArray(500000);
        res = merge_sort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test(timeout = 1000)
    public void MergeSortTestSortedArrayOfSize500000(){
        arr = generateArray.generateSortedArray(arr);
        res = merge_sort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test(timeout = 1000)
    public void MergeSortTestSortedReversedArrayOfSize500000(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = merge_sort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test(timeout = 1000)
    public void MergeSortTestRandomArrayOfSize800000(){
        arr = generateArray.generateRandomArray(800000);
        res = merge_sort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test(timeout = 1000)
    public void MergeSortTestSortedArrayOfSize800000(){
        arr = generateArray.generateSortedArray(arr);
        res = merge_sort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test(timeout = 1000)
    public void MergeSortTestSortedReversedArrayOfSize800000(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = merge_sort.sort(arr, 0, arr.length);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
}
