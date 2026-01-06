
// Standard Deviation of an Array

// Write a program to calculate the standard deviation of a given array of integers.

// The formula for standard deviation is :

// Your program should :
// Read an integer n representing the number of elements in the array.
// Read n integers.
// Calculate the mean of the array.
// Use the mean to compute the standard deviation.
// Print the standard deviation rounded to 2 decimal places.

// Input Format :

// First line : An integer n (number of elements)
// Second line : n space-separated integers.

// Example :

// Input : 5
//         2 4 4 4 5

// Output : 0.89

import java.util.*;

public class p23                                          
{
    public static void main(String gg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        System.out.print("Enter the values of arr : ");
        int arr[] = new int[n];

        for(int i=0;i<n;i++)                                                    
        {
            arr[i]=sc.nextInt();
        }

        double sum=0;                                                                    //  T.C. = O(n)    S.C. = O(n)

        for(int i=0;i<n;i++)                                                    
        {
            sum+=arr[i];
        }

        double mean = sum/(double)n;

        double sum1=0;

        for(int i=0;i<n;i++)                                                    
        {
            sum1+=Math.pow((arr[i]-mean),2);
        }

        double sd = Math.sqrt(sum1/n);

        System.out.printf("%.2f",sd);

    }
}