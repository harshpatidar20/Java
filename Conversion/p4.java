// Program for Decimal to Octal Conversion

// Given a decimal number as input, we need to write a program to convert the given decimal number into an equivalent octal number. 
// i.e convert the number with base value 10 to base value 8. The base value of a number system determines the number of digits used 
// to represent a numeric value. For example, the binary number system uses two digits 0 and 1, the octal number system 
// uses 8 digits from 0-7 and the decimal number system uses 10 digits 0-9 to represent any numeric value.

// Examples: 

// Input : 16
// Output: 20

// Input : 10
// Output: 12

// Input : 33
// Output: 41

import java.util.*;

public class p4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int octal=0;                                                      // T.C. = O(log(n))   S.C. = O(1)
        int base=1;            

        while(n!=0)
        {
            int digit=n%8;
            octal+=base*digit;
            base*=10;
            n=n/8;
        }

        System.out.print(octal);
    }
}