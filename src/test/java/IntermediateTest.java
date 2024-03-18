import org.example.sorting_algorithms.count_sort;
import org.example.sorting_algorithms.insertion_sort;
import org.example.sorting_algorithms.merge_sort;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;

public class IntermediateTest {

    @Test(timeout = 1000)
    public void testInsertionSortIntermediate(){
        insertion_sort insertionSort = new insertion_sort();

        int [] arr = {9, 4, 1,3,11,23, 32, 21, 1, 5};

        ArrayList<int[]> intermediateTest = new ArrayList<>();
        int[] array1 = {4, 9, 1, 3, 11, 23, 32, 21, 1, 5};
        int[] array2 = {1, 4, 9, 3, 11, 23, 32, 21, 1, 5};
        int[] array3 = {1, 3, 4, 9, 11, 23, 32, 21, 1, 5};
        int[] array4 = {1, 3, 4, 9, 11, 23, 32, 21, 1, 5};
        int[] array5 = {1, 3, 4, 9, 11, 23, 32, 21, 1, 5};
        int[] array6 = {1, 3, 4, 9, 11, 23, 32, 21, 1, 5};
        int[] array7 = {1, 3, 4, 9, 11, 21, 23, 32, 1, 5};
        int[] array8 = {1, 1, 3, 4, 9, 11, 21, 23, 32, 5};
        int[] array9 = {1, 1, 3, 4, 5, 9, 11, 21, 23, 32};
        intermediateTest.add(array1);
        intermediateTest.add(array2);
        intermediateTest.add(array3);
        intermediateTest.add(array4);
        intermediateTest.add(array5);
        intermediateTest.add(array6);
        intermediateTest.add(array7);
        intermediateTest.add(array8);
        intermediateTest.add(array9);

        insertionSort.sort(arr);
        ArrayList<int[]> intermediate = insertionSort.getIntermediate_results();

        int size = intermediate.size();
        for(int i = 0; i < size; i++){
            assertArrayEquals(intermediateTest.get(i), intermediate.get(i));
        }
    }
    @Test(timeout = 1000)
    public void testCountSortIntermediate() {
        count_sort countSort = new count_sort();

        int[] arr = {9, 4, 1, 3, 11, 23, 32, 21, 1, 5};
        ArrayList<int[]> intermediateTest = new ArrayList<>();

        int[] frequency = {0, 2, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] array1 = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] array2 = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] array3 = {1, 1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] array4 = {1, 1, 3, 4, 0, 0, 0, 0, 0, 0};
        int[] array5 = {1, 1, 3, 4, 5, 0, 0, 0, 0, 0};
        int[] array6 = {1, 1, 3, 4, 5, 9, 0, 0, 0, 0};
        int[] array7 = {1, 1, 3, 4, 5, 9, 11, 0, 0, 0};
        int[] array8 = {1, 1, 3, 4, 5, 9, 11, 21, 0, 0};
        int[] array9 = {1, 1, 3, 4, 5, 9, 11, 21, 23, 0};
        int[] array10 = {1, 1, 3, 4, 5, 9, 11, 21, 23, 32};

        intermediateTest.add(frequency);
        intermediateTest.add(array1);
        intermediateTest.add(array2);
        intermediateTest.add(array3);
        intermediateTest.add(array4);
        intermediateTest.add(array5);
        intermediateTest.add(array6);
        intermediateTest.add(array7);
        intermediateTest.add(array8);
        intermediateTest.add(array9);
        intermediateTest.add(array10);

        countSort.sort(arr);
        ArrayList<int[]> intermediate = countSort.getIntermediate_results();

        int size = intermediate.size();;
        for(int i = 0; i < size; i++){
            assertArrayEquals(intermediateTest.get(i), intermediate.get(i));
        }
    }
    @Test(timeout = 1000)
    public void testMergeSortIntermediate() {
        merge_sort mergeSort = new merge_sort();

        int[] arr = {9, 4, 1, 3, 11, 23, 32, 21, 1, 5};
        ArrayList<int[]> intermediateTest = new ArrayList<>();

        int[] array1 = {9};
        int[] array2 = {4};
        int[] array3 = {4, 9};
        int[] array4 = {4, 9};
        int[] array5 = {1};
        int[] array6 = {3};
        int[] array7 = {11};
        int[] array8 = {3, 11};
        int[] array9 = {3, 11};
        int[] array10 = {1, 3, 11};
        int[] array11 = {1, 3, 11};
        int[] array12 = {1, 3, 4, 9, 11};
        int[] array13 = {1, 3, 4, 9, 11};
        int[] array14 = {23};
        int[] array15 = {32};
        int[] array16 = {23, 32};
        int[] array17 = {23, 32};
        int[] array18 = {21};
        int[] array19 = {1};
        int[] array20 = {5};
        int[] array21 = {1, 5};
        int[] array22 = {1, 5};
        int[] array23 = {1, 5, 21};
        int[] array24 = {1, 5, 21};
        int[] array25 = {1, 5, 21, 23, 32};
        int[] array26 = {1, 5, 21, 23, 32};
        int[] array27 = {1, 1, 3, 4, 5, 9, 11, 21, 23, 32};

        intermediateTest.add(array1);
        intermediateTest.add(array2);
        intermediateTest.add(array3);
        intermediateTest.add(array4);
        intermediateTest.add(array5);
        intermediateTest.add(array6);
        intermediateTest.add(array7);
        intermediateTest.add(array8);
        intermediateTest.add(array9);
        intermediateTest.add(array10);
        intermediateTest.add(array11);
        intermediateTest.add(array12);
        intermediateTest.add(array13);
        intermediateTest.add(array14);
        intermediateTest.add(array15);
        intermediateTest.add(array16);
        intermediateTest.add(array17);
        intermediateTest.add(array18);
        intermediateTest.add(array19);
        intermediateTest.add(array20);
        intermediateTest.add(array21);
        intermediateTest.add(array22);
        intermediateTest.add(array23);
        intermediateTest.add(array24);
        intermediateTest.add(array25);
        intermediateTest.add(array26);
        intermediateTest.add(array27);

        mergeSort.sort(arr, 0, arr.length);
        ArrayList<int[]> intermediate = mergeSort.getIntermediate_results();

        int size = intermediate.size();
        for(int i = 0; i < size; i++){
            assertArrayEquals(intermediateTest.get(i), intermediate.get(i));
        }
    }
}
