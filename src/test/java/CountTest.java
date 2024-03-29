import org.example.GenerateArray;
import org.example.sorting_algorithms.count_sort;
import org.junit.Test;

import java.util.Arrays;


public class CountTest {
    GenerateArray generateArray = new GenerateArray();
    count_sort countSort = new count_sort();
    int[] arr = new int[1000000];
    int [] res = new int[1000000];

    @Test(timeout = 1000)
    public void CountSortTestRandomArrayOfSize10(){
        arr = generateArray.generateRandomPositiveArray(10);
        res = countSort.sort(arr);
        Arrays.sort(arr);
        assertArrayEquals(arr, res);
    }

    private void assertArrayEquals(int[] arr, int[] res) {
    }

    @Test(timeout = 1000)
    public void CountSortTestSortedArrayOfSize10(){
        arr = generateArray.generateSortedArray(arr);
        res = countSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test(timeout = 1000)
    public void CountSortTestSortedReversedArrayOfSize10(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = countSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test(timeout = 1000)
    public void CountSortTestRandomArrayOfSize100(){
        arr = generateArray.generateRandomPositiveArray(100);
        res = countSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test(timeout = 1000)
    public void CountSortTestSortedArrayOfSize100(){
        arr = generateArray.generateSortedArray(arr);
        res = countSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }


    @Test(timeout = 1000)
    public void CountSortTestSortedReversedArrayOfSize100(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = countSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test(timeout = 1000)
    public void CountSortTestRandomArrayOfSize1000(){
        arr = generateArray.generateRandomPositiveArray(1000);
        res = countSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test(timeout = 1000)
    public void CountSortTestSortedArrayOfSize1000(){
        arr = generateArray.generateSortedArray(arr);
        res = countSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test(timeout = 1000)
    public void CountSortTestSortedReversedArrayOfSize1000(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = countSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test(timeout = 1000)
    public void CountSortTestRandomArrayOfSize10000(){
        arr = generateArray.generateRandomPositiveArray(10000);
        res = countSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test(timeout = 1000)
    public void CountSortTestSortedArrayOfSize10000(){
        arr = generateArray.generateSortedArray(arr);
        res = countSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test(timeout = 1000)
    public void CountSortTestSortedReversedArrayOfSize10000(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = countSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test(timeout = 1000)
    public void CountSortTestRandomArrayOfSize100000(){
        arr = generateArray.generateRandomPositiveArray(100000);
        res = countSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test(timeout = 1000)
    public void CountSortTestSortedArrayOfSize100000(){
        arr = generateArray.generateSortedArray(arr);
        res = countSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test(timeout = 1000)
    public void CountSortTestSortedReversedArrayOfSize100000(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = countSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test(timeout = 1000)
    public void CountSortTestRandomArrayOfSize500000(){
        arr = generateArray.generateRandomPositiveArray(500000);
        res = countSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test(timeout = 1000)
    public void CountSortTestSortedArrayOfSize500000(){
        arr = generateArray.generateSortedArray(arr);
        res = countSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test(timeout = 1000)
    public void CountSortTestSortedReversedArrayOfSize500000(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = countSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test(timeout = 1000)
    public void CountSortTestRandomArrayOfSize800000(){
        arr = generateArray.generateRandomPositiveArray(800000);
        res = countSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test(timeout = 1000)
    public void CountSortTestSortedArrayOfSize800000(){
        arr = generateArray.generateSortedArray(arr);
        res = countSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test(timeout = 1000)
    public void CountSortTestSortedReversedArrayOfSize800000(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = countSort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
}
