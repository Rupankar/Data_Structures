package datastructure.java.sort;

public class insertion_sort {

    public static void main(String[] args)
    {
        int[] arr = {20,35,-15,7,-22,1,55};

        for(int unsortedIndex=1;unsortedIndex<arr.length;unsortedIndex++)
        {
            int currEle = arr[unsortedIndex];

            int i;

            for(i=unsortedIndex;i>0 && arr[i-1]>currEle;i--)
            {
                arr[i] = arr[i-1];
            }

            arr[i] = currEle;
        }

        for (int j : arr) {
            System.out.println("\t" + j);
        }
    }
}
