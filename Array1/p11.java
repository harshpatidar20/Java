// Program for addition of two matrices.

// Given two N x M matrices. Find a N x M matrix as the sum of given matrices each value at the sum of values of corresponding 
// elements of the given two matrices. 

import java.util.*;

public class p11
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of r : ");
        int r=sc.nextInt();
        System.out.print("Enter the value of c : ");
        int c=sc.nextInt();
        System.out.print("Enter the values of mat1 : ");
        int mat1[][] = new int[r][c];
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
            mat1[i][j]=sc.nextInt();
            }
        }

        System.out.print("Enter the values of mat2 : ");                                 // T.C. = O(r*c)  &&  S.C. = O(r*c)
        int mat2[][] = new int[r][c];
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
            mat2[i][j]=sc.nextInt();
            }
        }

        int result[][]=new int[r][c];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
            result[i][j]=mat1[i][j] + mat2[i][j];
            }
        }

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
            System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
         
    }
}