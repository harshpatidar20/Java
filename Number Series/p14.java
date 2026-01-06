// Program to add two fractions

// Given two integer arrays a[] and b[] containing two integers each representing the numerator and denominator of a fraction respectively. 
// The task is to find the sum of the two fractions and return the numerator and denominator of the result.

// Examples : 

// Input:  a = [1, 2] , b = [3, 2] 
// Output: [2, 1] 
// Explanation: 1/2 + 3/2 = 2/1

// Input:  a = [1, 3] , b = [3, 9] 
// Output: [2, 3] 
// Explanation: 1/3 + 3/9 = 2/3   

// Input:  a = [1, 5] , b = [3, 15] 
// Output: [2, 5] 
// Explanation: 1/5 + 3/15 = 2/5   

import java.util.*;

public class p14                                                   
{
    public static void main(String agrs[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of a : ");     
        int a[] = new int[2];

        for(int i=0;i<2;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.print("Enter the values of b : ");                 // T.C. = O(min(sumNumerator, denominator))   S.C. = O(1)
        int b[] = new int[2];

        for(int i=0;i<2;i++)
        {
            b[i]=sc.nextInt();
        }

        int denominator = a[1] * b[1];

        int num1 = a[0]*(denominator/a[1]);
        int num2 = b[0]*(denominator/b[1]);

        int sumNumerator = num1 + num2;

        int gcd=1;
        for(int i=1;i<=Math.min(sumNumerator,denominator);i++)
        {
            if(sumNumerator%i==0 && denominator%i==0)
            {
                gcd=i;
            }
        }

        int finalN = sumNumerator/gcd;
        int finalD = denominator/gcd;

        System.out.print("["+finalN+","+finalD+"]");

    }
}