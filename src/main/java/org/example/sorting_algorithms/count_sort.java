package org.example.sorting_algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class count_sort {

    private static final ArrayList<int[]> intermediate_results=new ArrayList<int[]>();

    public  int [] sort(int []array)
            {
                int auxiliary_size=0;
                int size= array.length;
                for (int j : array) {
                    auxiliary_size = Math.max(auxiliary_size, j);
                }
                int []frequency=new int[auxiliary_size+1];
                for (int j : array) {
                    frequency[j]++;
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

    public ArrayList<int[]> getIntermediate_results() {
        return intermediate_results;
    }
}
