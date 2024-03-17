package org.example;

import org.example.sorting_algorithms.count_sort;
import org.example.sorting_algorithms.insertion_sort;
import org.example.sorting_algorithms.merge_sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AlgorithmComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        GenerateArray generateArray = new GenerateArray();
        int[] arr = generateArray.generateRandomPositiveArray(size);

        System.out.println("Array length = " + size);
        System.out.println("\nElements randomly distributed : ");
        System.out.println("\nSorting Algorithm\tTime Taken(ns)");
        compareSortingAlgorithms(arr);

        System.out.println("\nElements already sorted : ");
        System.out.println("\nSorting Algorithm\tTime Taken(ns)");
        arr = generateArray.generateSortedArray(arr);
        compareSortingAlgorithms(arr);

        System.out.println("\nElements sorted in reverse order : ");
        System.out.println("\nSorting Algorithm\tTime Taken(ns)");
        arr = generateArray.generateSortedReversedArray(arr);
        compareSortingAlgorithms(arr);
    }

    private static void compareSortingAlgorithms(int[] arr) {
        printSortingTime("INSERTION", arr);
        printSortingTime("MERGE", arr);
        printSortingTime("COUNT", arr);
    }

    private static void printSortingTime(String sortType, int[] arr) {

        int[] arr2 = new int[arr.length];
        System.arraycopy(arr, 0, arr2, 0, arr.length);

        long startTime = System.nanoTime();

        switch (sortType) {
            case "INSERTION" -> {
                insertion_sort insertionSort = new insertion_sort();
                insertionSort.sort(arr2);
            }
            case "MERGE" -> {
                merge_sort mergeSort = new merge_sort();
                mergeSort.sort(arr2, 0, arr2.length);
            }
            case "COUNT" -> {
                count_sort countSort = new count_sort();
                countSort.sort(arr2);
            }
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.printf("%-17s %15d %n", sortType + "_SORT", duration);
    }
}
