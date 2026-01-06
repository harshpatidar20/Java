// Convert a Number to Any Base (2–16)

// Problem: Convert a decimal number to any given base (2 to 16).

// Example 

// Input: n=31, base=16
// Output: 1F


import java.util.*;

public class p13                                              
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Enter the base : ");
        int base = sc.nextInt();

        StringBuilder sb = new StringBuilder();                                             // T.C. = O(log n)   S.C. = O(log n)

        String s = "0123456789ABCDEF";
                                             
        while(n!=0)
        {
            int digit=n%base;
            sb.append(s.charAt(digit));
            n=n/base;
        }

        System.out.print(sb.reverse().toString());
        
    }
}