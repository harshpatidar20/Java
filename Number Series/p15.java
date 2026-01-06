// Sum of Digits of a Number

// Given a number n, find the sum of its digits.

// Examples : 

// Input: n = 687
// Output: 21
// Explanation: The sum of its digits are: 6 + 8 + 7 = 21

// Input: n = 12
// Output: 3
// Explanation: The sum of its digits are: 1 + 2 = 3

import java.util.*;

public class p15
{
    public static void main(String agrs[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int n = sc.nextInt();
    
        int sum=0;

        while(n!=0)                                    // T.C. = O(log n)   S.C. = O(1)
        {
            int digit=n%10;
            sum = digit+sum;
            n=n/10;
        }

        System.out.println(sum);
    }
}