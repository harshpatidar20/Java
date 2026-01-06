// Sum of all natural numbers in range L to R

// Given a range L and R, the task is to find the sum of all natural numbers in range L to R. 
// Examples: 
 
// Input: L = 2, R = 5
// Output: 14
// Explain: 2 + 3 + 4 + 5 = 14

// Input: L = 10, R = 20
// Output: 165

import java.util.*;

public class p26
{
    public static void main(String agrs[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();

        int sum=(b * (b + 1))/2 - (a * (a - 1))/2;                      // T.C. = O(1)   S.C. = O(1)

        System.out.println(sum);
    }
}