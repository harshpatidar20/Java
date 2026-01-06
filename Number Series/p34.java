// Square Free Number

// Given a number, check if it is square-free or not. A number is said to be square-free if no prime factor divides it more than once, 
// i.e., the largest power of a prime factor that divides n is one. First few square-free numbers 
// are 1, 2, 3, 5, 6, 7, 10, 11, 13, 14, 15, 17, 19, 21, 22, 23, 26, 29, 30, 31, 33, 34, 35, 37, 38, 39, ...

// Examples: 

// Input: n = 10
// Output: Yes
// Explanation: 10 can be factorized as 2*5. Since no prime factor appears more than once, it is a square free number.

// Input:  n = 20
// Output: No
// Explanation: 20 can be factorized as 2 * 2 * 5. Since prime factor appears more than once, it is not a square free number. 

import java.util.*;

public class p34
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        boolean isSquareFree=true;                                  // T.C. = O(√n)   S.C. = O(1)
        for(int i=2;i*i<=n;i++)
        {
            if(n%(i*i)==0)
            {
                isSquareFree=false;
                break;
            }
        }
        if(isSquareFree)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    
    }
}