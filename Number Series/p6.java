// Program to check if a number is Positive, Negative, Odd, Even, Zero

// Given a number n, the task is to check whether the given number is positive, negative, odd, even, or zero.

// A number is positive if it is greater than zero. We check this in the expression of if.
// If it is False, the number will either be zero or negative.
// This is also tested in subsequent expressions.
// In the case of odd and even A number is even if it is perfectly divisible by 2.
 
// When the number is divided by 2, we use the remainder operator % to compute the remainder.
// If the remainder is not zero, the number is odd.
// Examples:

// Input : 10
// Output : Positive number10 is Even

// Input : 0
// Output : 0 is Even

import java.util.*;

public class p6
{
    public static void main(String agrs[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();

        if(n>0)                                                                 // T.C. = O(1)   S.C. = O(1)
        {
            System.out.print("Positive number "+n);
        }
        else if(n<0)
        {
            System.out.print("Negative number"+n);
        }
        else
        {
            System.out.print("0");
        }

        if(n%2==0)
        {
            System.out.print(" is Even");
        }
        else
        {
            System.out.print(" is Odd");
        }
    }
}

