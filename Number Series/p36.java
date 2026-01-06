// Check if a number can be expressed as sum of two Prime Numbers

// Given a number n, the task is to check if it is possible to express n as the sum of two prime numbers, a and b. 
// If such pair does not exist, return [-1, -1].

// Note: If [a, b] is one solution with a <= b, and [c, d] is another solution with c <= d, and a < c then  [a, b] is considered as our answer.

// Examples: 

// Input: n = 19
// Output: Yes
// Explanation: The number 19 can be written as 17 + 2, here 17 and 2 are both primes.

// Input: n = 14
// Output: Yes
// Explanation: The number 14 can be written as 7 + 7.

// Input: n = 11
// Output: No

import java.util.*;                                    

public class p36
{
    static boolean isPrime(int x)                                         // T.C. = O(n.√n)   S.C. = O(1)
    {
        if(x<2) 
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(x);i++) 
        {
            if(x%i==0) 
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n : ");                                     
        int n=sc.nextInt();

        boolean flag=false;

        for(int i=2;i<=n/2;i++) 
        {
            if(isPrime(i) && isPrime(n-i)) 
            {
                flag=true;
                break; 
            }
        }

        if(flag) 
        {
            System.out.println("YES");
        }
        else 
        {
            System.out.println("NO");
        }
    }
}
