import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ui {

    private Scanner fileScanner, usrInputScanner;

    public Ui() {
        usrInputScanner = new Scanner(System.in);
        mainLoop();
    }

    public void mainLoop() {
        while(true) {
            System.out.println("enter the path of the input file");
            String path = usrInputScanner.nextLine();
            File file = new File(path);
            Sort_Array sortArray;
            try {
                sortArray = new Sort_Array(file);
            } catch (FileNotFoundException e) {
                System.out.println("cann't read file");
                continue;
            }
            System.out.println("choose a sorting algorithm:\n");
            System.out.println("1 - Simple sort\n");
            System.out.println("2 - efficient sort\n");
            System.out.println("3 - non-comparison sort\n");
            int algorithm = usrInputScanner.nextInt();
            System.out.println("show intermediate values ?\n");
            System.out.println("1 - yes");
            System.out.println("2 - no");
            int intermediate = usrInputScanner.nextInt();
            ArrayList<int[]> sorted = null;
            switch (algorithm) {
                case 1:
                    sorted = sortArray.simpleSort(intermediate == 1);
                    break;
                case 2:
                    sorted = sortArray.efficientSort(intermediate == 1);
                    break;
                case 3:
                    sorted = sortArray.nonComparisonSort(intermediate == 1);
                    break;
                default:
                    System.out.println("Error : unspecified choice");
                    break;
            }
            Sort_Array.print_intermediate_results(sorted);

        }
    }

    public static void main(String[] args) {
        Ui ui = new Ui();
    }
}


