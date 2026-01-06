
// Take two positive integers m and n as input.
// Find the m-th prime number and the n-th prime number.
// For each of these two prime numbers, calculate the sum of its digit repeatedly untill the result is a single-digit number(lessthan 10).

// Let these results be m1 and n1.
// Finally, print the value of m*m1.

// Input : m = 5 and n = 6 :

// 5th prime number = 11 --> digit sum = 1+1=2 --> m1 = 2
// 6th prime number = 13 --> digit sum = 1+3=4 --> n1 = 4

// Output : m * m1 = 5 * 2 = 10

import java.util.*;                                                    
                                                      

public class p30
{
    public static boolean isPrime(int n)                                            //  T.C. = O(n.√nlogn)    S.C. = O(1)
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

        int count=0;
        int m1=0;
        int n1=0;

        for(int i=2;count<n;i++)
        {
            if(isPrime(i))
            {
                count++;
                if(count==m)
                {
                    m1=i;
                }
                if(count==n)
                {
                    n1=i;
                }
            }
        }

        int sum1=0;

        while(m1>=10)
        {
            sum1=0;
            while(m1!=0)
            {
                int digit=m1%10;
                sum1+=digit;
                m1=m1/10;
            }
            m1=sum1;
        }

        int sum2=0;

        while(n1>=10)
        {
            sum2=0;
            while(n1!=0)
            {
                int digit=n1%10;
                sum2+=digit;
                n1=n1/10;
            }
            n1=sum2;
        }

        int result = m * m1;

        System.out.println(result);

    }
}