// Alternates in an Array

// You are given an array arr[], the task is to return a list elements of arr in alternate order (starting from index 0).

// Examples:

// Input: arr[] = [1, 2, 3, 4]
// Output: 1 3
// Explanation:

// Take first element: 1
// Skip second element: 2
// Take third element: 3
// Skip fourth element: 4

// Input: arr[] = [1, 2, 3, 4, 5]
// Output: 1 3 5

// Explanation:
// Take first element: 1
// Skip second element: 2
// Take third element: 3
// Skip fourth element: 4
// Take fifth element: 5

// Constraints:
// 1 <=  arr.size <= 105
// 1 <= arr[i] <= 105

import java.util.*;

public class p32
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n =sc.nextInt();
        System.out.print("Enter the values of array : ");
        int arr[] = new int[n];

        for(int i=0;i<n;i++)                                                     // T.C. = O(n)  &&  S.C. = O(n)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i=i+2)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

