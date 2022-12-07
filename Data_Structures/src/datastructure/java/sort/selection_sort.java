package datastructure.java.sort;

public class selection_sort {

    public static void main(String[] args)
    {
        int[] arr = {20,35,-15,7,-22,1,55};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int smallest = i;
                int temp = -1;

                if(arr[j]<arr[i])
                {
                    smallest = j;
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
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
