package datastructure.java.sort;

public class quick_sort {

    public static void main(String[] args) {

        int[] arr = {20,35,-15,7,-22,1,55};

        quickSort(arr,0,arr.length);

        for(int i:arr)
        {
            System.out.print("\t"+i);
        }
    }

    public static void quickSort(int[] arr,int start,int end)
    {
        if(end-start <2) //one element array
        {
            return;
        }

        int pivotIndex = partition(arr,start,end);
        quickSort(arr,start,pivotIndex);
        quickSort(arr,pivotIndex+1,end);

    }

    public static int partition(int[] arr,int start,int end)
    {
        int pivotElement=arr[start];
        int i=start;
        int j=end;

        while (i<j){

            while (i<j && arr[--j]>=pivotElement); //empty loop; loop exits when an element greater than pivot is found
            if(i<j)
            {
                arr[i] = arr[j];
            }

            while (i<j && arr[++i]<=pivotElement);// empty loop; loop exists when an element smaller than pivot is found
            if(i<j)
            {
                arr[j]=arr[i];
            }
        }

        arr[j] = pivotElement;
        return j;
    }

}