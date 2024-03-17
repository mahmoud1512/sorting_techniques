import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class merge_sort {

   private static ArrayList<int[]>intermediate_results=new ArrayList<int[]>();

    public  int []sort(int[] array,int starting_point,int length )
    {
        if(length==1)
        {
            int x=array[starting_point];
            int []element=new int[1];
            element[0]=x;
            return element;
        }
        int mid_point=length/2;

        int [] left=sort(array,starting_point,mid_point);
        intermediate_results.add(left);
        int [] right=sort(array,starting_point+mid_point,length-mid_point);
        intermediate_results.add(right);
        int [] ans=merge(left,right);
        intermediate_results.add(ans);
        return ans;
    }
    public static int []merge(int[]left,int[]right)
    {
        int i=0;
        int j=0;
        int c=0;
        int [] ans=new int[left.length+ right.length];
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
    public static void print_intermediate_results()
    {
        int size=intermediate_results.size();
        for (int i=0;i<size;i++)
        {
            System.out.println(Arrays.toString(intermediate_results.get(i)));
        }
    }

    public static void main(String[] args) {
        merge_sort x=new merge_sort();
        int[] y=new int[8];
       for (int i = 0; i < 8; i++) {
            y[i]=(int)(Math.random()*100);
        }
       y=x.sort(y,0,y.length);
        x.print_intermediate_results();
    }

}
