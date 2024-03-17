package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ui {

    private Scanner fileScanner;
    private final Scanner usrInputScanner;

    public Ui() {
        usrInputScanner = new Scanner(System.in);
        mainLoop();
    }

    public void mainLoop() {
        while(true) {
            System.out.println("Enter the path of the input file");
            String path = usrInputScanner.nextLine();
            File file = new File(path);
            Sort_Array sortArray;
            try {
                sortArray = new Sort_Array(file);
            } catch (FileNotFoundException e) {
                System.out.println("Can n't read file");
                continue;
            }
            System.out.println("Choose a sorting algorithm or exit:\n");
            System.out.println("1 - Simple sort\n");
            System.out.println("2 - Efficient sort\n");
            System.out.println("3 - Non-comparison sort\n");
            System.out.println("4 - Exit\n");
            int algorithm = usrInputScanner.nextInt();
            System.out.println("Show intermediate values ?\n");
            System.out.println("1 - Yes");
            System.out.println("2 - No");
            int intermediate = usrInputScanner.nextInt();
            ArrayList<int[]> sorted = null;
            switch (algorithm) {
                case 1 -> sorted = sortArray.simpleSort(intermediate == 1);
                case 2 -> sorted = sortArray.efficientSort(intermediate == 1);
                case 3 -> sorted = sortArray.nonComparisonSort(intermediate == 1);
                case 4 -> System.exit(0);
                default -> System.out.println("Error : unspecified choice");
            }
            Sort_Array.print_intermediate_results(sorted);
        }
    }
}


