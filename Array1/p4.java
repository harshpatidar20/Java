// Find the smallest and second smallest elements in an array

// Given an array arr[] of integers, find the smallest and second smallest distinct elements in the array. The result 
// should be returned in ascending order, meaning the smallest element should come first, followed by the second smallest.
// If there is no valid second smallest (i.e., all elements are the same or the array has fewer than two elements), then return -1.

// Examples:

// Input: arr[] = [12, 25, 8, 55, 10, 33, 17, 11]
// Output: [8, 10]
// Explanation: The smallest element is 1 and second smallest element is 10.

// Input: arr[] = [2, 4, 3, 5, 6]
// Output: [2, 3]
// Explanation: 2 and 3 are respectively the smallest and second smallest elements in the array.

// Input: arr[] = [1, 1, 1]
// Output: [-1]
// Explanation: Only element is 1 which is smallest, so there is no second smallest element.

import java.util.*;

public class p4      
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n =sc.nextInt();
        System.out.print("Enter the values of array : ");
        int arr[] = new int[n];

        if(n<2)
        {
            System.out.println("-1");
            return;
        }

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int firstMin = arr[0];
        int secondMin = Integer.MAX_VALUE;

        for(int i=1;i<n;i++)                                                              // T.C. = O(n)  &&  S.C. = O(n)
        {
            if(firstMin > arr[i])
            {
                firstMin=arr[i];
            }
            else if(arr[i]>firstMin && arr[i]<secondMin)
            {
                secondMin=arr[i];
            }
        }

        if(secondMin==Integer.MAX_VALUE)
        {
            System.out.println("[-1]");
        }
        else
        {
            System.out.print("["+firstMin+", "+ secondMin+"]");
        }

    }
}