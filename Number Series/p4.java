// Find all factors of a Natural Number in sorted order

// Given a natural number n, print all distinct divisors of it.

// Examples: 

//  Input : n = 10       
//  Output: 1 2 5 10

//  Input:  n = 100
//  Output: 1 2 4 5 10 20 25 50 100

//  Input:  n = 125
//  Output: 1 5 25 125 

import java.util.*;

public class p4
{
    public static void main(String agrs[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)                                             // T.C. = O(n)   S.C. = O(1)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}