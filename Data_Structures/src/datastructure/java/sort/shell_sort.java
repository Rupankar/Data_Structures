package datastructure.java.sort;

public class shell_sort {

    public static void main(String[] args) {

        int[] arr = {20,35,-15,7,-22,1,55};

        for(int gap=arr.length/2;gap>0;gap=gap/2)
        {
            for(int i=gap;i<arr.length;i++)
            {

                int currEle = arr[i];

                int j;

                for(j=i;j>=gap && arr[j-gap]>currEle;j=j-gap)
                {
                    arr[j] = arr[j-gap];
                }

                arr[j] = currEle;
            }
        }

        for(int j : arr)
        {
            System.out.print("\t"+j);
        }

    }
}