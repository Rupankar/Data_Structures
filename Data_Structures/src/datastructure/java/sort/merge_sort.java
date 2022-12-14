package datastructure.java.sort;

public class merge_sort {

    public static void main(String[] args) {

        int[] arr = {20,35,-15,7,-22,1,55};

        divide(arr,0,arr.length);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print("\t"+arr[i]);
        }

    }

    public static void divide(int[] array,int start,int end)
    {
        if(end-start<2) {
            return;
        }

        int mid = (start+end)/2;

        divide(array,start,mid);
        divide(array,mid,end);
        sort(array,start,mid,end);
    }

    public static void sort(int[] array, int start,int mid, int end)
    {
        if(array[mid-1]<array[mid])
        {
            return;
        }

        int i=start;
        int j=mid;
        int tempIndex=0;

        int[] temp = new int[end-start];

        while(i<mid && j<end)
        {
            if(array[i]<array[j])
            {
                temp[tempIndex] = array[i];
                tempIndex++;
                i++;
            }

            if(array[j]<array[i])
            {
                temp[tempIndex] = array[j];
                tempIndex++;
                j++;
            }
        }

        System.arraycopy(array,i,array,start+tempIndex,mid-i);
        System.arraycopy(temp,0,array,start,tempIndex);


    }

}