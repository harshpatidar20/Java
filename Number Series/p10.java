// Program to find LCM of two numbers

// Given two positive integers a and b. Find the Least Common Multiple (LCM) of a and b.
// LCM of two numbers is the smallest number which can be divided by both numbers. 

// Input :  a = 10, b = 5
// Output :  10
// Explanation : 10 is the smallest number divisible by both 10 and 5

// Input :  a = 5, b = 11
// Output :  55
// Explanation : 55 is the smallest number divisible by both 5 and 11

import java.util.*;

public class p10
{
    public static void main(String agrs[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value oF b : ");
        int b = sc.nextInt();

        int gcd=1;

        for(int i=1;i<=Math.min(a,b);i++)                            // T.C. = O(min(a, b))   S.C. = O(1)
        {
            if(a%i==0 && b%i==0)
            {
                gcd=i;
            }
        }

        int lcm=(a*b)/gcd;   //O(1)

        System.out.println(lcm);
    }
}