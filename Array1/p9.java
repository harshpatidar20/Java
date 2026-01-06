// Second Largest Element in an Array

// Given an array of positive integers arr[] of size n, the task is to find second largest distinct element in the array.

// Note: If the second largest element does not exist, return -1.

// Examples:

// Input: arr[] = [12, 35, 1, 10, 34, 1]
// Output: 34
// Explanation: The largest element of the array is 35 and the second largest element is 34.

// Input: arr[] = [10, 5, 10]
// Output: 5
// Explanation: The largest element of the array is 10 and the second largest element is 5.

// Input: arr[] = [10, 10, 10]
// Output: -1
// Explanation: The largest element of the array is 10 there is no second largest element.

import java.util.*;

public class p9                                         
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
            arr[i]=sc.nextInt();                                                             // T.C. = O(n)  &&  S.C. = O(n)
        }

        int firstMax=arr[0];
        int secondMax=Integer.MIN_VALUE;

        for(int i=1;i<n;i++)
        {
            if(firstMax < arr[i])
            {
                firstMax=arr[i];
            }
            else if(arr[i] < firstMax && arr[i] > secondMax)
            {
                secondMax=arr[i];
            }
        }

        if(secondMax==Integer.MIN_VALUE)
        {
            System.out.println("-1");
        }
        else
        {
        System.out.print(firstMax+" "+secondMax);
        }

    }
}