package datastructure.java.sort;

public class counting_sort {
    public static void main(String[] args) {

        int[] arr = {3,2,1,1,5};

        countingSort(arr,1,5);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print("\t"+arr[i]);
        }
    }

    public static void countingSort(int[] arr, int min,int max)
    {
        int[] countArr = new int[(max-min+1)];

        for(int i=0;i<arr.length;i++)
        {
            countArr[(arr[i]-min)]++; //get the element in the main array and subtract by the smallest ele to get the index in the counting arr
        }

        /*for(int i=0;i<countArr.length;i++)
        {
            System.out.print("\t"+countArr[i]);
        }*/

        int j=0;

        for(int i=min;i<=max;i++)
        {
            while(countArr[i-min]>0) //get the correct index in the counting array
            {
                //System.out.println("Value of i: "+i+" Value of j: "+j);
                arr[j++] = i;       //writing the value to the main arr
                countArr[i-min]--;  //decrement the value in the counting arr
            }
        }
    }
}