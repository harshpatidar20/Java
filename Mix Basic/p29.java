
// Write a program that takes two integer inputs, input1 and input2, representing positions in the sequence of prime numbers. The program 
// should find the input1-th and input2-th prime numbers, compute their product, subtract 1 from the result, and print the final output.

// Example :

// Input : input1 = 2
//         input2 = 3

// Explain : The 2nd prime number is 3.
//           The 3rd prime number is 5.
//           Product of these primes : 3x5 = 15
//           subtract 1 : 15 - 1 = 14

// Output : 14

import java.util.*;

public class p29
{
    public static boolean isPrime(int input2)
    {
        if(input2<2)
        {
            return false;                                                          //  T.C. = O(input2 * √input2)    S.C. = O(n)
        }
        if(input2==2)
        {
            return true;
        }

        for(int i=2;i*i<=input2;i++)
        {
            if(input2%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value of input1 : ");
        int input1=sc.nextInt();
        System.out.print("Enter a value of input2 : ");
        int input2=sc.nextInt();

        int count=0;
        int prime1=0;
        int prime2=0;

        for(int i=2;count<input2;i++)
        {
            if(isPrime(i))
            {
                count++;
                if(count==input1)
                {
                    prime1=i;
                }
                if(count==input2)
                {
                    prime2=i;
                }
            }
        }

        int product = prime1 * prime2 - 1;
        System.out.print(product);
    }
}