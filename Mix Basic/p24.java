
// You are given two integers m and n. Your task is to compute the sum of the m-th prime number to the (m + n)-th prime number, inclusive.

// Input :

// Two integers m and n such that m>=1 and n>=0

// Output :

// Print the sum of the m-th,......(m+n)-th prime numbers.

// Example : 

// Input : m=2
//         n=2

// Output : Sum = 15

// Explanation : 2nd prime = 3
//               3rd prime = 5
//               4th prime = 7
//               Sum = 3+5+7 = 15

// Input : m=1
//         n=3

// Explanation : We need  the sum of 1st, 2nd, 3rd and 4th prime numbers.

//              sum = 2+3+5+7 = 17

import java.util.*;                              

public class p24
{
    public static boolean isPrime(int n)
    {
        if(n<2)
        {
            return false;
        }
        if(n==2)
        {
            return true;
        }

        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String gg[])                              
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value of m : ");
        int m=sc.nextInt();
        System.out.print("Enter a value of n : ");
        int n=sc.nextInt();

        int sum=0;
        int count=0;

        for(int i=2;count<m+n;i++)
        {
            if(isPrime(i))
            {
                count++;
                if(count>=m )
                {
                    sum+=i;
                }
            }
        }
        
        System.out.println(sum);
    }
}