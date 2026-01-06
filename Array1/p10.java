// Counting frequencies of array elements

// Given an array arr[] of non-negative integers which may contain duplicate elements. Return the frequency of each distinct element
// present in the array.
// Examples: 

// Input :  arr[] = [10, 20, 10, 5, 20]
// Output : [[10, 2], [20, 2], [ 5, 1]]
// Explanation: Here, 10 occurs 2 times, 20 occurs 2 times, and 5 occurs once.

// Input : arr[] = [10, 20, 20]
// Output : [[10, 1], [20, 2]] 
// Explanation: Here, 10 occurs 1 time, 20 occurs 2 times.

import java.util.*;
                                                             
public class p10                                            
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

        boolean[] visited = new boolean[n];                                                 // T.C. = O(n^2)  &&  S.C. = O(n)

        System.out.print("[");

        boolean first=true;

        for(int i=0;i<n;i++) 
        {
            if(visited[i]) 
            {
                continue; 
            }

        int freq=1;
        for(int j=i+1;j<n;j++)
        {
            if(arr[i]==arr[j])
            {
                visited[j]=true;
                freq++;
            }
        }

        if(!first)
        {
            System.out.print(", ");
        }

        System.out.print("["+arr[i]+","+freq+"]");
        first=false;   
        }

        System.out.print("]");
    }
}