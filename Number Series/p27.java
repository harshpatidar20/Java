// Deficient Number

// A number n is said to be Deficient Number if sum of all the divisors of the number denoted by divisorsSum(n) 
// is less than twice the value of the number n. And the difference between these two values is called the deficiency.
// Mathematically, if below condition holds the number is said to be Deficient: 
 

// divisorsSum(n) < 2 * n
// deficiency = (2 * n) - divisorsSum(n)

// The first few Deficient Numbers are:
// 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 19 .....
// Given a number n, our task is to find if this number is Deficient number or not. 

// Examples : 
 
// Input: 21
// Output: YES
// Divisors are 1, 3, 7 and 21. Sum of divisors is 32.
// This sum is less than 2*21 or 42.

// Input: 12
// Output: NO

// Input: 17
// Output: YES

import java.util.*;

public class p27
{
    public static void main(String agrs[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int sum=0;

        for(int i=1;i<=n;i++)                                               // T.C. = O(n)   S.C. = O(1)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }

        if(2*n > sum)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}