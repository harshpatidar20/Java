// Check if an array is subset of another array

// Given two arrays a[] and b[] of size m and n respectively, the task is to determine whether b[] is a subset of a[].
// Both arrays are not sorted, and elements are distinct.

// Examples: 

// Input: a[] = [11, 1, 13, 21, 3, 7], b[] = [11, 3, 7, 1] 
// Output: true

// Input: a[]= [1, 2, 3, 4, 5, 6], b = [1, 2, 4] 
// Output: true

// Input: a[] = [10, 5, 2, 23, 19], b = [19, 5, 3] 
// Output: false

import java.util.*;

public class p8
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array a : ");
        int n =sc.nextInt();
        System.out.print("Enter the size of array b : ");
        int m =sc.nextInt();
        System.out.print("Enter the values of array a : ");
        int a[] = new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.print("Enter the values of array b : ");                           // T.C. = O(n*m)  &&  S.C. = O(1)
        int b[] = new int[m];

        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }

        boolean subSet = true;

        for(int i=0;i<m;i++)
        {
            boolean found = false;
            for(int j=0;j<n;j++)
            {
                if(b[i]==a[j])
                {
                    found = true;
                    break;
                } 
            }

            if(!found)
            {
                subSet=false;
                break;
            }
        }

        System.out.println(subSet); 
    }
}
