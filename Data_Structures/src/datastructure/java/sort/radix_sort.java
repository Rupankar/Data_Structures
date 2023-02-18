package datastructure.java.sort;

public class radix_sort {

    public static void main(String[] args) {

        int[] arr = {4725,4586,1330,8792,1594,5729};

        radixsort(arr,10,4);

        for(int value:arr)
        {
            System.out.print("\t"+value);
        }
    }

    public static void radixsort(int[] arr,int radix,int width)
    {
        for(int i=0;i<width;i++)
        {
            radixSingleSort(arr,i,radix);
        }
    }

    public static void radixSingleSort(int[] arr,int position,int radix)
    {
        int numItems = arr.length;

        int[] countArray = new int[radix];

        for(int value:arr)
        {
            countArray[getDigit(position,value,radix)]++;
        }

        for (int i=1;i<countArray.length;i++)
        {
            countArray[i] += countArray[i-1];
        }

        int[] temp = new int[numItems];

        for(int i = numItems - 1;i>=0;i--)
        {
            temp[--countArray[getDigit(position,arr[i],radix)]]=arr[i];
        }

        for(int i=0;i<numItems;i++)
        {
            arr[i] = temp[i];
        }
    }

    public static int getDigit(int position, int value,int radix)
    {
        return value/ (int) Math.pow(10,position) % radix;
    }

}