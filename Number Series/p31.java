// Nth Fibonacci Number

// Given a positive integer n, the task is to find the nth Fibonacci number.

// The Fibonacci sequence is a sequence where the next term is the sum of the previous two terms. 
// The first two terms of the Fibonacci sequence are 0 followed by 1. The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21

// Example:

// Input: n = 2
// Output: 1 
// Explanation: 1 is the 2nd number of Fibonacci series.

// Input: n = 5
// Output: 5
// Explanation: 5 is the 5th number of Fibonacci series.

import java.util.*;

public class p31
{
    public static int fib(int n)                                
    {
        if(n==0)
        {
            return 0;                                                     // T.C. = O(n)   S.C. = O(1) 
        }
        if(n==1)
        {
            return 1;
        }

        int a=0;
        int b=1;
        int c=0;

        for(int i=2;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        return b;  
    }
    public static void main(String agrs[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print(fib(n));
    }
}


// So for any input n ≥ 47, your program prints the wrong number due to overflow.

// ✅ Fix for larger inputs

// Use long (up to F(92)) or BigInteger (for arbitrarily large n):

// import java.util.*;
// import java.math.BigInteger;

// public class p31 {
//     public static BigInteger fib(int n) {
//         if (n == 0) return BigInteger.ZERO;
//         if (n == 1) return BigInteger.ONE;

//         BigInteger a = BigInteger.ZERO;
//         BigInteger b = BigInteger.ONE;
//         BigInteger c = BigInteger.ZERO;

//         for (int i = 2; i <= n; i++) {
//             c = a.add(b);
//             a = b;
//             b = c;
//         }
//         return b;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int n = sc.nextInt();
//         System.out.println(fib(n));
//     }
// }
