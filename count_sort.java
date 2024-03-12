import java.util.Arrays;

public class count_sort {

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
                int []output_array=new int[size];
                int count=0;
                for (int i = 0; i <= auxiliary_size; i++) {
                    while(frequency[i]>0)
                    {
                        output_array[count++]=i;
                        frequency[i]--;
                    }

                }
                return output_array;
            }

    public static void main(String[] args) {
//        count_sort x=new count_sort();
//       int[] y=new int[10];
//        for (int i = 0; i < 10; i++) {
//            y[i]=(int)(Math.random()*1000);
//        }
//        y=x.sort(y);
//        System.out.println(Arrays.toString(y));
    }
}
