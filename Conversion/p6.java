// Program for Octal to Decimal Conversion

// Given an octal number as input, we need to write a program to convert the given octal number into equivalent decimal number.

// Examples:

// Input : 67
// Output: 55
// Explain : Decimal = (6 × 8¹) + (7 × 8⁰)  
//                   = 48 + 7 = 55
// Input : 512
// Output: 330
// Input : 123
// Output: 83

import java.util.*;

public class p6
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int decimal=0;                                                         // T.C. = O(log(n))   S.C. = O(1)
        int base=1;

        while(n!=0)
        {
            int digit=n%10;
            decimal+=base*digit;
            base*=8;
            n=n/10;
        }
        System.out.println(decimal);
    }
}