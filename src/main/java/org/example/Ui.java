package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ui {

    private final Scanner usrInputScanner;

    public Ui() {
        usrInputScanner = new Scanner(System.in);
        mainLoop();
    }

    public void mainLoop() {
        System.out.println("*************************************************");
        System.out.println("****** Hello in sorting algorithm program *******");
        System.out.println("*************************************************\n");
        System.out.println("Enter the path of the input file");
        String path = usrInputScanner.nextLine();
        while(true) {
            File file = new File(path);
            Sort_Array sortArray = null;
            try {
                sortArray = new Sort_Array(file);
            } catch (FileNotFoundException e) {
                System.out.println("Can n't read file");
                System.out.println("Enter the path of the input file");
                path = usrInputScanner.nextLine();
                continue;
            }

            System.out.println("Choose a sorting algorithm or exit:\n");
            System.out.println("1 - Simple sort\n");
            System.out.println("2 - Efficient sort\n");
            System.out.println("3 - Non-comparison sort\n");
            System.out.println("4 - Exit\n");
            int choice = usrInputScanner.nextInt();
            if(choice == 4){
                System.out.println("Ending program :)");
                System.exit(0);
            }
            System.out.println("Show intermediate values ?\n");
            System.out.println("1 - Yes");
            System.out.println("2 - No");
            int intermediate = usrInputScanner.nextInt();
            ArrayList<int[]> sorted = null;
            switch (choice) {
                case 1 -> {
                    assert sortArray != null;
                    sorted = sortArray.simpleSort(intermediate == 1);
                }
                case 2 -> {
                    assert sortArray != null;
                    sorted = sortArray.efficientSort(intermediate == 1);
                }
                case 3 -> {
                    assert sortArray != null;
                    sorted = sortArray.nonComparisonSort(intermediate == 1);
                }
                default -> System.out.println("Error : unspecified choice");
            }
            assert sorted != null;
            Sort_Array.print_intermediate_results(sorted);
        }
    }
}


