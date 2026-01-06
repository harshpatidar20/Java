// Remove duplicates from Sorted Array

// Given a sorted array arr[] of size n, the goal is to rearrange the array so that all distinct elements appear at the beginning 
// in sorted order. Additionally, return the length of this distinct sorted subarray.

// Note: The elements after the distinct ones can be in any order and hold any value, as they don't affect the result.

// Examples: 

// Input: arr[] = [2, 2, 2, 2, 2]
// Output: [2]
// Explanation: All the elements are 2, So only keep one instance of 2.

// Input: arr[] = [1, 2, 2, 3, 4, 4, 4, 5, 5]
// Output: [1, 2, 3, 4, 5]

// Input: arr[] = [1, 2, 3]
// Output: [1, 2, 3]
// Explanation : No change as all elements are distinct.

import java.util.*;

public class p15                                          
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
        }

        System.out.print("[");

        boolean first=true;                                                       // T.C. = O(n)     S.C. = O(1)

        for(int i=0;i<n;i++)
        {
            if(i==0 || arr[i]!=arr[i-1])
            {
                if(!first)
                {
                    System.out.print(", ");
                }
                System.out.print(arr[i]);
                first=false;
            }
        }

        System.out.print("]");
    }
}