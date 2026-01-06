// Count prime numbers that can be expressed as sum of consecutive prime numbers

// Given an integer N, the task is to find the number of prime numbers up to N that can be expressed as a sum of consecutive primes.

// Examples:

// Input: N = 45
// Output: 3
// Explanation:
// Below are the prime numbers up to 45 that can be expressed as sum of consecutive prime numbers:

// 5 = 2 + 3
// 17 = 2 + 3 + 5 + 7
// 41 = 2 + 3 + 5 + 7 + 11 + 13
// Therefore, the count is 3. 

// Input: N = 4
// Output: 0 

import java.util.*;                                   

public class p30
{
    public static boolean isPrime(int n)                                   // T.C. = O(n√n)   S.C. = O(1)
    {
        if(n==2)
        {
            return true;
        }
        if(n<2)
        {
            return false;
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

    public static void main(String agrs[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int count=0;
        int sum=0;
        int terms=0;

        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            {
                sum+=i;
                terms++;
                if(sum>n)
                {
                    break;
                }
                if(isPrime(sum) && terms>=2)
                {
                    count++;
                }
            }
        }

        System.out.println(count);

       
    }
}