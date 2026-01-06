// Print all prime factors of a given number

// Given a number n, the task is to find all prime factors of n.

// Examples:

// Input: n = 24
// Output: 2 2 2 3
// Explanation: The prime factorization of 24 is 2x2x2×3.

// Input: n = 13195
// Output: 5 7 13 29
// Explanation: The prime factorization of 13195 is 5×7×13×29.

import java.util.*;

public class p17                                     
{
    public static void main(String agrs[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();

        for(int i=2;i<=n;i++)                                            // T.C. = O(n√n)   S.C. = O(1)
        {
            boolean isPrime=true;
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    isPrime=false;
                }
            }
            if(isPrime)
            {
                while(n%i==0)
                {
                    System.out.print(i+" ");
                    n=n/i;
                }
            }
        }
        
    }
}