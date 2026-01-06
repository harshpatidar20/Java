// Sort a K-Increasing-Decreasing Array

// Given a K-increasing-decreasing array arr[], the task is to sort the given array. An array is said to be K-increasing-decreasing 
// if elements repeatedly increase upto a certain index after which they decrease, then again increase, a total of K times. 
// The diagram below shows a 4-increasing-decreasing array.
 
// Example: 
 
// Input: arr[] = {57, 131, 493, 294, 221, 339, 418, 458, 442, 190} 
// Output: 57 131 190 221 294 339 418 442 458 493

// Input: arr[] = {1, 2, 3, 4, 3, 2, 1} 
// Output: 1 1 2 2 3 3 4 

import java.util.*;

public class p14
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();
        System.out.print("Enter the values of array : ");
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();                                                             
        }                                               // Not solve

        Arrays.sort(arr);

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}


