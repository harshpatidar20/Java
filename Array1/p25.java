// Find duplicates in O(n) time and O(n) extra space

// Given an array arr[] of n elements that contains elements from 0 to n-1, with any of these numbers appearing any number of times. 
// The task is to find the repeating numbers.

// Note: The repeating element should be printed only once.

// Example: 

// Input: n = 7, arr[] = [1, 2, 3, 6, 3, 6, 1]
// Output: 1, 3, 6
// Explanation: The numbers 1 , 3 and 6 appears more than once in the array.

// Input : n = 5, arr[] = [1, 2, 3, 4 ,3]
// Output: 3
// Explanation: The number 3 appears more than once in the array.


import java.util.*;

public class p25   
{                                                      
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        HashMap<Integer,Boolean> hm = new HashMap<>();
        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();
        System.out.print("Enter the values of array : ");
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();                                                             
        }

        for(int i=0;i<n;i++)
        {
            if(!hm.containsKey(arr[i]))
            {
                hm.put(arr[i],false);
            }
            else if(hm.get(arr[i])==false)
            {
                System.out.print(arr[i]+" ");
                hm.put(arr[i],true);
            }
        }

    }
}