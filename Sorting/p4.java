
// Quick Sort

import java.util.*;

public class p4
{
    public static int partition(int arr[],int low, int high)                     // T.C. =  O(log n)   &&   S.C. =  O(log n)
    {                                                                           // (Best , Avg.) (Worst = O(n^2))
        int pivot=arr[high];
        int i= low-1;

        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)     // Sort in ascending order     For descending order : arr[j]>pivot
            {
                i++;

                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
        }
       

        public static void quickSort(int arr[], int low, int high)
        {
            if(low<high)
            {
                int pidx = partition(arr,low,high);

                quickSort(arr,low,pidx-1);
                quickSort(arr,pidx+1,high);
            }
        }

        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number : ");
            int n=sc.nextInt();
            System.out.println("Enter the values : ");
            int arr[]=new int[n];

            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }

            quickSort(arr,0,n-1);

            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();

        }
}