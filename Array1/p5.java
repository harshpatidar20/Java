// Find non-repeating elements in a given Array of integers
// Given an array of integers of size N, the task is to find the non-repeating element in this array. 

// Examples:

// Input: {-1, 2, -1, 3, 0}
// Output: 2,3,0

// Input: {9, 4, 9, 6, 7, 4}
// Output: 6,7

import java.util.*;

public class p5
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n =sc.nextInt();
        System.out.print("Enter the values of array : ");
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            int freq=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    freq++;
                }
            }

            if(freq==1)
            {
                System.out.print(arr[i]+" ");
            }
        }
      
    }
}

