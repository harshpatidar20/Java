// Count of smaller elements

// Given an unsorted array arr. Find the count of elements less than or equal to the given element x.

// Examples:

// Input: x = 9, arr = [10, 1, 2, 8, 4, 5] 
// Output: 5

// Explanation: The 5 elements are 1, 2, 8, 4 and 5.

// Input: x = 2, arr = [1, 2, 2, 5, 7, 2, 9] 
// Output: 4 

// Explanation: The 4 elements are 1, 2, 2 and 2.

// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(1)

// Constraints:
// 1 <= arr.size() <= 105
// 1 <= ai <= 105
// 0 <= x <= 105

import java.util.*;

public class p35
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        int x =sc.nextInt();
        System.out.print("Enter the size of array : ");
        int n =sc.nextInt();
        System.out.print("Enter the values of array : ");
        int arr[] = new int[n];

        for(int i=0;i<n;i++)                                                     // T.C. = O(n)  &&  S.C. = O(1)
        {
            arr[i]=sc.nextInt();
        }

        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=x)
            {
                count++;
            }
        }

        System.out.print(count);
    }
}
