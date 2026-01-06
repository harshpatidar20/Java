// Prime Numbers

// A prime number is a natural number greater than 1 that has exactly two positive divisors: 1 and itself. Numbers that have 
// more than two divisors are called composite numbers The number 1 is neither a prime nor composite. All primes are odd, except for 2.

// A total of 25 prime numbers are there between 1 to 100.
// These are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97. 

import java.util.*;

public class p1 
{
    public static boolean isPrime(int n)
    {
        if(n<2)
        {
            return false;                                                   // T.C. = O(n × √n)   S.C. = O(1)
        }
        if(n==2)
        {
            return true;
        }

        for(int i=2;i*i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String agrs[])                                       
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();

        for(int i=2;i<n;i++)                                              
        {
            if(isPrime(i))
            {
                System.out.print(i+" ");
            }
        }
    }
} 