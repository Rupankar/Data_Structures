package datastructure.java.sort;

public class bubble_sort {

    public static void main(String[] args)
    {
        int[] arr = {20,35,-15,7,-22,1,55};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

                System.out.print("\t"+arr[j]);

            }

            System.out.println("------------------------------");
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
