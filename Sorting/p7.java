
// Counting Sort

import java.util.*;

public class p7 
{
    public static void countingSort(int[] arr, int n) 
    {

        // Find the maximum value in the array
        int max=arr[0];
        for(int i=1;i<n;i++) 
        {
            if(arr[i]>max) 
            {
                max=arr[i];
            }
        }

        // Create count array
        int count []=new int[max + 1];

        // Count occurrences
        for(int i=0;i<n;i++) 
        {
            count[arr[i]]++;
        }

        // Build the sorted array
        int index = 0;
        for(int i=0;i<=max;i++) 
        {
            while(count[i]>0) 
            {
                arr[index++]=i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements (non-negative integers):");
        int arr[] = new int[n];

        for(int i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
        }

        countingSort(arr,n);

        System.out.println("Sorted array:");
        for(int i=0;i<n;i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}
