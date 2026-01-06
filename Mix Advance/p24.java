// Ques. Write a code to check whether no is prime or not. Condition use function check() to find whether entered no is positive or 
// negative ,if negative then enter the no, And if yes pass no as a parameter to prime() and check whether no is prime or not?

// Whether the number is positive or not, if it is negative then print the message “please enter the positive number”
// It is positive then call the function prime and check whether the take positive number is prime or not. 

import java.util.*;

public class p24
{
    public static boolean check(int n)
    {
        if(n<0)
        {
            System.out.println("please enter the positive number");
            return false;
        }
        return true;
    }
    public static boolean isPrime(int n)                                                    // T.C. = O(√n)    S.C. = O(1)
    { 
        if(n==2)
        {
            return true;
        }
        if(n<=1)
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

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n=sc.nextInt();

        if(check(n))
        {
            if(isPrime(n))
            {
                System.out.println("Number is Prime");
            }
            else
            {
                System.out.println("Number is Not Prime");
            }
        }

    }
}