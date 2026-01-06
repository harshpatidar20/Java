// Search in a Matrix

// Given a 2D integer array mat[][] and a number x, find whether element x is present in the matrix or not.

// Examples:

// Input: mat[][] = [[6, 23, 21],[4, 45, 32],[69, 11, 87]], x = 32
// Output: true

// Explanation: 32 is present in the matrix, so the output is 1.

// Input: mat[][] = [[14, 34, 23, 95, 43, 28]], x = 55
// Output: false

// Explanation: 55 is not present in the matrix, so the output is 0.

// Input: mat[][] = [[87, 9, 99],[101, 3, 111]], x = 101
// Output: true

// Explanation: 101 is present in the matrix.

// Constraints:
// 1 <= mat.size(), mat[0].size() <= 1000
// 1 <= mat[][] <= 105
// 1 <= x <= 105

import java.util.*;                         // INPUT AS SRTING TRY PLS

public class p33
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of row : ");
        int n =sc.nextInt();
        System.out.print("Enter the size of column : ");
        int m =sc.nextInt();
        System.out.print("Enter the values of matrix : ");
        int arr[][] = new int[n][m];

        for(int i=0;i<n;i++)                                                    
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.print("Enter the value of x : ");
        int x =sc.nextInt();

        boolean found = false;                                                       // T.C. = O(n*m)  &&  S.C. = O(1)
        outer: // label for outer loop
        for(int i=0;i<n;i++)                                                    
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==x)
                {
                    found=true;
                    break outer; // exits both loops
                }
            }
        }

        if(found)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}