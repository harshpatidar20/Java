// Remove duplicates from unsorted array using Map data structure

// Given an unsorted array of integers, print the array after removing the duplicate elements from it. 
// We need to print distinct array elements according to their first occurrence.

// Examples: 

// Input : arr[] = { 1, 2, 5, 1, 7, 2, 4, 2}
// Output : 1 2 5 7 4
// Explanation : {1, 2} appear more than one time.

import java.util.*;

public class p20
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        HashMap<Integer,Boolean> hm = new HashMap<>();

        System.out.print("Enter the size : ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.print("Enter the values : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++)                                                                // T.C. = O(n)  &&  S.C. = O(n)
        {
            if(!hm.containsKey(arr[i])) 
            {
                System.out.print(arr[i]+" ");
                hm.put(arr[i], true);
            }
        }

    }
}