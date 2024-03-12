import java.util.Arrays;

public class merge_sort {

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
        int [] right=sort(array,starting_point+mid_point,length-mid_point);
        int [] ans=merge(left,right);
        System.out.println(Arrays.toString(ans));
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

    public static void main(String[] args) {
//        merge_sort x=new merge_sort();
//        int[] y=new int[25];
//        for (int i = 0; i < 25; i++) {
//            y[i]=(int)(Math.random()*1000);
//        }
//       y=x.sort(y,0,y.length);
//        System.out.println(Arrays.toString(y));
    }

}
