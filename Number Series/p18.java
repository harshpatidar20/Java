// Kth largest factor of number N

// Given two positive integers N and K, the task is to print the Kth largest factor of N.  

// Input: N = 12, K = 3
// Output: 4
// Explanation: The factors of 12 are {1, 2, 3, 4, 6, 12}. The largest factor is 12 and the 3rd largest factor is 4.

// Input: N = 30, K = 2
// Output: 15
// Explanation: The factors of 30 are {1, 2, 3, 5, 6, 10, 15, 30} and the 2nd largest factor is 15.

import java.util.*;

public class p18
{
    public static void main(String agrs[])                
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of k : ");
        int k = sc.nextInt();

        int count = 0;                                                                        // T.C. = O(n)   S.C. = O(1)

        for(int i=n;i>=1;i--)   // start from largest possible factor
        {  
            if(n%i==0)       // if i is a factor
            {           
                count++;
                if(count==k)                 // found the K-th largest factor
                {      
                    System.out.println(i);
                    return;                 // exit immediately
                }
            }
        }
        
        // If K is larger than number of factors
        System.out.println("Not enough factors");
    }
}