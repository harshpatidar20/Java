// Largest element in an Array

// Given an array arr. The task is to find the largest element in the given array. 

// Examples: 

// Input: arr[] = [10, 20, 4]
// Output: 20
// Explanation: Among 10, 20 and 4, 20 is the largest. 

// Input: arr[] = [20, 10, 20, 4, 100]
// Output: 100

import java.util.*;

public class p2
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


        int max = arr[0];   // for negative values in array[important]

        for(int i=1;i<n;i++)                                                           // T.C. = O(n)  &&  S.C. = O(n)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }

        System.out.println(max);
        
    }
}
        