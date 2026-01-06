
// You are given a matrix of size mxn (rowsxcolumns). Your task is to :

// Check if the input dimensions m or n are less than or equal to 0 :

// If true, print : "invalid input"
// otherwise, read the matrix elements and find and print the minimum value in the matrix.

// Input Format :

// The first line contains two integers m and n (number of rows and columns).
// The next m lines each contain n integers(matrix elements).

// Output Format :

// If m<=0 or n<=0, print :
// Invalid input
// Else, print the minimum element in the matrix.

// Example :

// Input :  3  3
//          1   2   3
//          3  -3   4
//          -1  2   3

// Output : -3

import java.util.*;

public class p21
{
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value of m : ");
        int m=sc.nextInt();
        System.out.print("Enter a value of n : ");
        int n=sc.nextInt();

        if(m<=0 || n<=0)                                                              //  T.C. = O(nxm)    S.C. = O(1)
        {
            System.out.println("invalid input");
        }
        else
        {

        int min = Integer.MAX_VALUE;

        for(int i=0;i<m;i++)                                                      
        {
            for(int j=0;j<n;j++)
            {
                int val=sc.nextInt();
                if(min>val)
                {
                    min=val;
                }
            }
        }

        System.out.print(min);
    }
    }
}




