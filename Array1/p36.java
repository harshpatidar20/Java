// Remove Duplicates Sorted Array

// You are given a sorted array arr[] containing positive integers. Your task is to remove all duplicate elements from this array such that 
// each element appears only once. Return an array containing these distinct elements in the same order as they appeared.
// Examples :

// Input: arr[] = [2, 2, 2, 2, 2]
// Output: [2]

// Explanation: After removing all the duplicates only one instance of 2 will remain i.e. [2] so modified array will 
// contains 2 at first position and you should return array containing [2] after modifying the array.

// Input: arr[] = [1, 2, 4]
// Output: [1, 2, 4]

// Explation:  As the array does not contain any duplicates so you should return [1, 2, 4].

// Constraints:
// 1 ≤ arr.size() ≤ 105
// 1 ≤ arr[i] ≤ 106


import java.util.*;

public class p36
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
        
        int j=0;                                                                        // T.C. = O(n)  &&  S.C. = O(1)
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[j])
            {
                j++;
                arr[j]=arr[i];
            }
        }  

        System.out.print("[");
        for(int i=0;i<=j;i++)
        {
            System.out.print(arr[i]);
            if(i<j)
            {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}