// Remove duplicates from unsorted array using LinkedHashSet data structure

// Given an unsorted array of integers, print the array after removing the duplicate elements from it. 
// We need to print distinct array elements according to their first occurrence.

// Examples: 

// Input : arr[] = { 1, 2, 5, 1, 7, 2, 4, 2}
// Output : [1, 2, 5, 7, 4]
// Explanation : {1, 2} appear more than one time.

import java.util.*;

public class p22
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();

        System.out.print("Enter the values of array : ");                             // T.C. = O(n)  &&  S.C. = O(n)
        for(int i=0;i<n;i++)
        {
           set.add(sc.nextInt());                                                             
        }

        System.out.print(set);
    }
}