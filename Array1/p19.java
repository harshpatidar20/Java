// Find first non-repeating element in a given Array of integers

// Given an array of integers of size N, the task is to find the first non-repeating element in this array. 

// Examples:

// Input: {-1, 2, -1, 3, 0}
// Output: 2
// Explanation: The first number that does not repeat is : 2

// Input: {9, 4, 9, 6, 7, 4}
// Output: 6

import java.util.*;

public class p19
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
            arr[i]=sc.nextInt();                                                             // T.C. = O(n^2)  &&  S.C. = O(n)
        }

        for(int i=0;i<n;i++)
        {
            int count = 0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}