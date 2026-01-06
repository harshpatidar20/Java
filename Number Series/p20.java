// Perfect Number

// A number is a perfect number if it is equal to the sum of its proper divisors, that is, the sum of its positive divisors excluding the 
// number itself. Find whether a given positive integer n is perfect or not.

// Examples: 

// Input: n = 15
// Output: false
// Explanation: Divisors of 15 are 1, 3 and 5. Sum of divisors is 9 which is not equal to 15.

// Input: n = 6
// Output: true
// Explanation: Divisors of 6 are 1, 2 and 3. Sum of divisors is 6.

import java.util.*;

public class p20
{
    public static void main(String agrs[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int sum=0;

        for(int i=1;i<n;i++)                                               // T.C. = O(n)   S.C. = O(1)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }

        if(n==sum)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}