import java.util.ArrayList;
import java.util.Arrays;

public class count_sort {

    private static ArrayList<int[]> intermediate_results=new ArrayList<int[]>();

    public  int [] sort(int []array)
            {
                int auxiliary_size=0;
                int size= array.length;
                for (int i = 0; i < size; i++) {
                    auxiliary_size=Math.max(auxiliary_size,array[i]);
                }
                int []frequency=new int[auxiliary_size+1];
                for (int i = 0; i < size ; i++) {
                    frequency[array[i]]++;
                }
                intermediate_results.add(frequency.clone());
                int []output_array=new int[size];
                int count=0;
                for (int i = 0; i <= auxiliary_size; i++) {
                    while(frequency[i]>0)
                    {
                        output_array[count++]=i;
                        intermediate_results.add(output_array.clone());
                        frequency[i]--;
                    }

                }
                return output_array;
            }
    public static void print_intermediate_results()
    {
        int size=intermediate_results.size();
        for (int i=0;i<size;i++)
        {
            if (i==0)
                System.out.println("The frequency array :-");
            else
                System.out.println("Adding a new element :-");
            System.out.println(Arrays.toString(intermediate_results.get(i)));
        }
    }

    public static void main(String[] args) {
        count_sort x=new count_sort();
       int[] y=new int[10];
        for (int i = 0; i < 10; i++) {
            y[i]=(int)(Math.random()*50);
        }
        y=x.sort(y);
        //System.out.println(Arrays.toString(y));
        x.print_intermediate_results();
    }
}
