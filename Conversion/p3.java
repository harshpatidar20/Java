// Decimal to Binary Conversion Program

// Given a non negative number n, the task is to convert the given number into an equivalent binary representation.

// Examples: 

// Input: n = 12
// Output: "1100"
// Explanation: the binary representation of 12 is "1100", since 12 = 1×23 + 1×22 + 0×21+ 0×20 = 12

// Input: n = 33
// Output: "100001"
// Explanation: the binary representation of 33 is "100001", since  1×25 + 0×24 + 0×23 + 0×22 + 0×21 + 1×20  = 33

import java.util.*;

public class p3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        // String b= Integer.toBinaryString(n);                                      // T.C. = O(log n)   S.C. = O(log n)

        // System.out.println(b);

        int binary=0;
        int base=1;

        while(n>0)                                                                  // T.C. = O(log(n))   S.C. = O(1)
        {
            int digit=n%2;
            binary+=base*digit;
            base*=10;
            n=n/2;
        }

        System.out.println(binary);
    }
}