// Check Even or Odd

// Given a number n, check whether it is even or odd. Return true for even and false for odd.

// Examples: 

// Input: n = 15
// Output: false
// Explanation: 15 % 2 = 1, so 15 is odd .

// Input: n = 44
// Output: true
// Explanation: 44 % 2 = 0, so 44 is even.

import java.util.*;

public class p19
{
    public static void main(String agrs[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if(n%2==0)                                                            // T.C. = O(1)   S.C. = O(1)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}