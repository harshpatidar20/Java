// Program for Armstrong Numbers

// Given a number x, determine whether the given number is Armstrong's number or not. A positive integer of n digits is called an 
// Armstrong number of order n (order is the number of digits) if
// abcd... = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ....

// Here a, b, c and d are digits of input number abcd.....

// Examples

// Input: n = 153
// Output: true
// Explanation: 153 is an Armstrong number, 1*1*1 + 5*5*5 + 3*3*3 = 153

// Input: n = 9474
// Output: true
// Explanation: 9^4 + 4^4 + 7^4 + 4^4 = 6561 + 256 + 2401 + 256 = 9474l;

// Input: n = 123
// Output: false
// Explanation: 1³ + 2³ + 3³ = 1 + 8 + 27 = 36

import java.util.*;                                

public class p25
{
    public static void main(String agrs[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int count=0;                                                   // T.C. = O(log n)   S.C. = O(1)
        int original = n;

        while(n>0)  // for counting digits in a number
        {
            n=n/10;
            count++;
        }

        int sum=0;
        int temp=original;

        while(original>0)   
        {
            int digit=original%10;
            sum+=Math.pow(digit,count);
            original=original/10;
        }

        if(sum==temp)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}