// Replace all ‘0’ with ‘5’ in an input Integer

// Given an integer as input and replace all the ‘0’ with ‘5’ in the integer. 

// Examples: 

// Input: 102 
// Output: 152
// Explanation: All the digits which are '0' is replaced by '5' 

// Input: 1020 
// Output: 1525
// Explanation: All the digits which are '0' is replaced by '5'

import java.util.*;

public class p5 
{
    public static void main(String agrs[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();

        int  rev=0;
       
        while(n!=0)                                                   // T.C. = O(d)   S.C. = O(1)  where,d=no. of digits
        {
            int digit=n%10;
            if(digit==0)
            {
                digit=5;
            }
            rev = rev * 10 + digit;
            n=n/10;
        }

        int result=0;

        while(rev!=0)
        {
            int digit=rev%10;
            result = result * 10 + digit;
            rev=rev/10;
        }
        System.out.print(result);
       
    }
}


// Replace '0' with '5' in a number and reverse the number

// Logic : int  rev=0;
       
//         while(n!=0)                                                  
//         {
//             int digit=n%10;
//             if(digit==0)
//             {
//                 digit=5;
//             }
//             rev = rev * 10 + digit;
//             n=n/10;
//         }