package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AlgorithmComparison {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (random.nextInt(1000000));
        }

        System.out.println("Array length = " + size);
        System.out.println("\nElements randomly distributed : ");
        System.out.println("\nSorting Algorithm\tTime Taken(ns)");
        compareSortingAlgorithms(arr);

        System.out.println("\nElements already sorted : ");
        System.out.println("\nSorting Algorithm\tTime Taken(ns)");
        Arrays.sort(arr);
        compareSortingAlgorithms(arr);

        System.out.println("\nElements sorted in reverse order : ");
        System.out.println("\nSorting Algorithm\tTime Taken(ns)");
        for (int i = 0; i <= arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size - i - 1] = t;
        }
        compareSortingAlgorithms(arr);
    }

    private static void compareSortingAlgorithms(int arr[]) {
        printSortingTime("INSERTION", arr);
        printSortingTime("MERGE", arr);
        printSortingTime("COUNT", arr);
    }

    private static void printSortingTime(String sortType, int[] arr) {

        int arr2[] = new int[arr.length];
        System.arraycopy(arr, 0, arr2, 0, arr.length);

        long startTime = System.nanoTime();

        switch (sortType) {
            case "INSERTION":
                insertion_sort.sort(arr2);
                break;
            case "MERGE":
                merge_sort.sort(arr2, 0, arr2.length);
                break;
            case "COUNT":
                count_sort.sort(arr2);
                break;
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.printf("%-17s %15d %n", sortType + "_SORT", duration);
    }
}
