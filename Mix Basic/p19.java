
// 2D Array Row Order Based on Even/Odd Row Index 

// Given a 2D array with m rows and n columns , print the elements of th array such that :

// Rows with even indices(0,2,4,...) are printed in the same order.
// Rows with odd indices(1,3,5,...) are printed in the reverse order.

// Input Format : 

// First line : Two integers m and n
// Next m lines : Each contains n integers

// Example : 

// Input :  4 4
//          1 2 3 4
//          5 6 7 8 
//          9 10 11 12
//          13 14 15 16

// Output :  1 2 3 4
//           8 7 6 5 
//           9 10 11 12
//           16 15 14 13

import java.util.*;

public class p19
{
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
            System.out.print("Enter a value of n : ");
            int n=sc.nextInt();
            System.out.print("Enter a value of m : ");
            int m=sc.nextInt();
            System.out.print("Enter a values of arr : ");                                  
            int arr[][]=new int[n][m];

            for(int i=0;i<n;i++)                                                      //  T.C. = O(nxm)    S.C. = O(nxm)
            {
                for(int j=0;j<m;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }

            for(int i=0;i<n;i++)
            {
                if(i%2==0)
                {
                    for(int j=0;j<m;j++)
                    {
                        System.out.print(arr[i][j]+" ");
                    }
                }
                else
                {
                    for(int j=m-1;j>=0;j--)
                    {
                        System.out.print(arr[i][j]+" ");
                    }
                }
                System.out.println();
            }
    }
}