import org.example.GenerateArray;
import org.example.count_sort;
import org.example.insertion_sort;
import org.junit.Test;
//import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;


public class InsertionTest {
    GenerateArray generateArray = new GenerateArray();
    int[] arr = new int[1000000];
    int [] res = new int[1000000];

    @Test(timeout = 1000)
    public void InsertionSortTestRandomArrayOfSize10(){
        arr = generateArray.generateRandomArray(10);
        res = insertion_sort.sort(arr);
        Arrays.sort(arr);
        assertArrayEquals(arr, res);
    }
    @Test(timeout = 1000)
    public void InsertionSortTestSortedArrayOfSize10(){
        arr = generateArray.generateSortedArray(arr);
        res = insertion_sort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test(timeout = 1000)
    public void InsertionSortTestSortedReversedArrayOfSize10(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = insertion_sort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test(timeout = 1000)
    public void InsertionSortTestRandomArrayOfSize100(){
        arr = generateArray.generateRandomArray(100);
        res = insertion_sort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test(timeout = 1000)
    public void InsertionSortTestSortedArrayOfSize100(){
        arr = generateArray.generateSortedArray(arr);
        res = insertion_sort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }


    @Test(timeout = 1000)
    public void InsertionSortTestSortedReversedArrayOfSize100(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = insertion_sort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test(timeout = 1000)
    public void InsertionSortTestRandomArrayOfSize1000(){
        arr = generateArray.generateRandomArray(1000);
        res = insertion_sort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test(timeout = 1000)
    public void InsertionSortTestSortedArrayOfSize1000(){
        arr = generateArray.generateSortedArray(arr);
        res = insertion_sort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test(timeout = 1000)
    public void InsertionSortTestSortedReversedArrayOfSize1000(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = insertion_sort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test(timeout = 1000)
    public void InsertionSortTestRandomArrayOfSize10000(){
        arr = generateArray.generateRandomArray(10000);
        res = insertion_sort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test(timeout = 1000)
    public void InsertionSortTestSortedArrayOfSize10000(){
        arr = generateArray.generateSortedArray(arr);
        res = insertion_sort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }

    @Test(timeout = 1000)
    public void InsertionSortTestSortedReversedArrayOfSize10000(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = insertion_sort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test(timeout = 1000)
    public void InsertionSortTestRandomArrayOfSize100000(){
        arr = generateArray.generateRandomArray(100000);
        res = insertion_sort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test(timeout = 1000)
    public void InsertionSortTestSortedArrayOfSize100000(){
        arr = generateArray.generateSortedArray(arr);
        res = insertion_sort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test(timeout = 1000)
    public void InsertionSortTestSortedReversedArrayOfSize100000(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = insertion_sort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test(timeout = 1000)
    public void InsertionSortTestRandomArrayOfSize500000(){
        arr = generateArray.generateRandomArray(500000);
        res = insertion_sort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test(timeout = 1000)
    public void InsertionSortTestSortedArrayOfSize500000(){
        arr = generateArray.generateSortedArray(arr);
        res = insertion_sort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test(timeout = 1000)
    public void InsertionSortTestSortedReversedArrayOfSize500000(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = insertion_sort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test(timeout = 1000)
    public void InsertionSortTestRandomArrayOfSize800000(){
        arr = generateArray.generateRandomArray(800000);
        res = insertion_sort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test(timeout = 1000)
    public void InsertionSortTestSortedArrayOfSize800000(){
        arr = generateArray.generateSortedArray(arr);
        res = insertion_sort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
    @Test(timeout = 1000)
    public void InsertionSortTestSortedReversedArrayOfSize800000(){
        arr = generateArray.generateSortedReversedArray(arr);
        res = insertion_sort.sort(arr);
        Arrays.sort(arr);

        assertArrayEquals(arr, res);
    }
}