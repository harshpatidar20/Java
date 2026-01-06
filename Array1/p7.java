// Equilibrium Index

// Given an array arr[] of size n, the task is to return an equilibrium index (if any) or -1 if no equilibrium index exists. The
// equilibrium index of an array is an index such that the sum of all elements at lower indexes equals the sum of all elements at higher indexes.


// Note: When the index is at the start of the array, the left sum is 0, and when it's at the end, the right sum is 0.

// Examples:

// Input: arr[] = [1, 2, 0, 3]
// Output: 2
// Explanation: The sum of left of index 2 is 1 + 2 = 3 and sum on right of index 2 is 3.

// Input: arr[] = [1, 1, 1, 1]
// Output: -1 
// Explanation: There is no equilibrium index in the array.

// Input: arr[] = [-7, 1, 5, 2, -4, 3, 0]
// Output: 3
// Explanation: The sum of left of index 3 is -7 + 1 + 5 = -1 and sum on right of index 3 is -4 + 3 + 0 = -1.

import java.util.*;

public class p7                                     
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

        int totalSum = 0;                                                             // T.C. = O(n)  &&  S.C. = O(n)
        int leftSum = 0;
        int rightSum = 0;
        boolean found = false;

        for(int i=0;i<n;i++)
        {
            totalSum+=arr[i];
        }

        for(int i=0;i<n-1;i++)
        {
            rightSum = totalSum - leftSum - arr[i];
            if(leftSum == rightSum)
            {
                System.out.println(i);
                found = true;
                break;
            }

            leftSum+=arr[i];
        }

        if(!found)
        {
            System.out.println("-1");
        }
    }
}