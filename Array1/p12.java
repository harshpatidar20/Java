// Program to find sum of elements in a given array.

// Given an array of integers, find the sum of its elements.

// Examples:

// Input : arr[] = {1, 2, 3}
// Output : 6
// Explanation: 1 + 2 + 3 = 6

// Input : arr[] = {15, 12, 13, 10}
// Output : 50

import java.util.*;

public class p12
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();
        
        int sum = 0;                                                                   // T.C. = O(n)  &&  S.C. = O(1)

        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            sum+=num;
        }

        System.out.println("Sum is : "+sum);

    }
}