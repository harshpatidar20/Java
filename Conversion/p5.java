// Program to Convert Octal Number to Binary Number

// Given an Octal number as input, the task is to convert that number to Binary number.

// Examples: 

// Input : Octal = 345
// Output : Binary = 11100101
// Explanation : 
// Equivalent binary value of 3: 011
// Equivalent binary value of 4: 100
// Equivalent binary value of 5: 101

// Input : Octal = 120
// Output : Binary = 1010000

import java.util.*;

public class p5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int decimal=0;                                                       // T.C. = O(log(n))   S.C. = O(1)
        int base=1;

        while(n!=0)
        {
            int digit=n%10;
            decimal+=base*digit;
            base*=8;
            n=n/10;
        }

        String binary = Integer.toBinaryString(decimal);

        System.out.print(binary);

    }
}