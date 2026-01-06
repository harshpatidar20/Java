// Find all factors of a Positive Number

// Given a positive integer n, find all the distinct divisors of n.

// Examples:

// Input: n = 10       
// Output: [1, 2, 5, 10]
// Explanation: 1, 2, 5 and 10 are the divisors of 10. 

// Input: n = 100
// Output: [1, 2, 4, 5, 10, 20, 25, 50, 100]
// Explanation: 1, 2, 4, 5, 10, 20, 25, 50 and 100 are divisors of 100.

import java.util.*;

public class p16
{
    public static void main(String agrs[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();

        List<Integer> factors = new ArrayList<>();

        for(int i=1;i<=n;i++)                                             // T.C. = O(n)   S.C. = O(k) where, k = no. of factors of n 
        {
            if(n%i==0)
            {
                factors.add(i);
            }
        }

        System.out.print(factors);
    }
}