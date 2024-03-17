import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sort_Array {

    private static ArrayList<int[]> intermediate_results = new ArrayList<int[]>();

    private int[] array;

    public Sort_Array(File inputArray) throws FileNotFoundException {
        Scanner sc = new Scanner(inputArray);
        String array = sc.nextLine();
        String[] stringArray = array.split(",");
        this.array = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            this.array[i] = Integer.parseInt(stringArray[i]);
        }
    }

    public ArrayList<int[]> simpleSort(boolean intermediate)
    {
        intermediate_results.clear();
        int size = array.length;
        for (int i = 1; i < size; i++) {
            int key = array[i];
            int k=i-1;
            while (k >= 0 && array[k] > key) {
                array[k + 1] = array[k];
                k = k - 1;
            }
            array[k + 1] = key;
            if(intermediate)
                intermediate_results.add(array.clone());
        }
        if (intermediate) {
            return intermediate_results;
        }
        else {
            ArrayList<int[]> singleStep = new ArrayList<int[]>();
            singleStep.add(array);
            return singleStep;
        }
    }

    public  ArrayList<int[]> efficientSort(boolean intermediate)
    {
        intermediate_results.clear();
        int[] output_array = mergeSortRecursive(this.array, 0, array.length, intermediate);
        if (intermediate) {
            return intermediate_results;
        }
        else {
            ArrayList<int[]> singleStep = new ArrayList<int[]>();
            singleStep.add(output_array);
            return singleStep;
        }
    }

    private int [] mergeSortRecursive(int[] array,int starting_point,int length, boolean intermediate) {
        if(length==1)
        {
            int x=array[starting_point];
            int []element = new int[1];
            element[0] = x;
            return element;
        }
        int mid_point=length/2;

        int [] left=mergeSortRecursive(array,starting_point,mid_point, intermediate);
        if(intermediate)
            intermediate_results.add(left);
        int [] right=mergeSortRecursive(array,starting_point+mid_point,length-mid_point, intermediate);
        if(intermediate)
            intermediate_results.add(right);
        int [] ans=merge(left,right);
        if(intermediate)
            intermediate_results.add(ans);
        return ans;
    }

    public static int [] merge(int[]left,int[]right)
    {
        int i=0;
        int j=0;
        int c=0;
        int [] ans = new int[left.length+ right.length];
        while(i<left.length&&j<right.length)
        {
            if(right[j]<=left[i])
            {
                ans[c++]=right[j++];
            }
            else
            {
                ans[c++]=left[i++];
            }
        }
        while(i< left.length)
        {
            ans[c++]=left[i++];
        }
        while (j<right.length)
        {
            ans[c++]=right[j++];
        }
        return ans;
    }
    public  ArrayList<int[]> nonComparisonSort(boolean intermediate)
    {
        intermediate_results.clear();
        int auxiliary_size=0;
        int size= array.length;
        for (int i = 0; i < size; i++) {
            auxiliary_size=Math.max(auxiliary_size,array[i]);
        }
        int [] frequency=new int[auxiliary_size+1];
        for (int i = 0; i < size ; i++) {
            frequency[array[i]]++;
        }
        if(intermediate)
            intermediate_results.add(frequency.clone());
        int []output_array=new int[size];
        int count=0;
        for (int i = 0; i <= auxiliary_size; i++) {
            while(frequency[i]>0)
            {
                output_array[count++]=i;
                if(intermediate)
                    intermediate_results.add(output_array.clone());
                frequency[i]--;
            }

        }
        if (intermediate) {
            return intermediate_results;
        }
        else {
            ArrayList<int[]> singleStep = new ArrayList<int[]>();
            singleStep.add(output_array);
            return singleStep;
        }
    }

    public static void print_intermediate_results(ArrayList<int[]> intermediate_results)
    {
        int size=intermediate_results.size();
        for (int i=0;i<size;i++)
        {
            System.out.println(Arrays.toString(intermediate_results.get(i)));
        }
    }
}
