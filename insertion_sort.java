import java.util.ArrayList;
import java.util.Arrays;

public class insertion_sort {
    private static ArrayList<int[]> intermediate_results=new ArrayList<int[]>();

    public int[] sort(int[] array)
    {
        int size= array.length;
        for (int i = 1; i < size; i++) {
            int key=array[i];
            int k=i-1;
            while (k >= 0 && array[k] > key) {
                array[k + 1] = array[k];
                k = k - 1;
            }
            array[k + 1] = key;
            intermediate_results.add(array.clone());
        }
        return array;
    }
    public static void print_intermediate_results()
    {
        int size=intermediate_results.size();
        for (int i=0;i<size;i++)
        {
            System.out.println("Array at pass: "+ (i+1));
            System.out.println(Arrays.toString(intermediate_results.get(i)));
        }
    }

    public static void main(String[] args) {
                insertion_sort x=new insertion_sort();
     int[] y=new int[10];
       for (int i = 0; i < 10; i++) {
            y[i]=(int)(Math.random()*1000);
        }
       y=x.sort(y);
        x.print_intermediate_results();
    }


}
