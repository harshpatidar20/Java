// Write a program to reverse digits of a number

// Given an Integer n, find the reverse of its digits.

// Examples:  

// Input: n = 122
// Output: 221
// Explanation: By reversing the digits of number, number will change into 221.

// Input: n = 200
// Output: 2
// Explanation: By reversing the digits of number, number will change into 2.

// Input: n = 12345 
// Output: 54321
// Explanation: By reversing the digits of number, number will change into 54321.

import java.util.*;

public class p13                                                             
{
    public static void main(String agrs[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int n = sc.nextInt();
        int rev=0;

        while(n!=0)                                                // T.C. = O(log n)   S.C. = O(1) 
        {
            int digit=n%10;
            rev=rev*10 + digit;
            n=n/10;
        }

        System.out.println(rev);
        
    }
}