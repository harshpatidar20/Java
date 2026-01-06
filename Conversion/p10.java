// Convert Hexadecimal to Decimal

// Problem: Convert a hexadecimal number (e.g., 1A) to decimal.

// Example 

// Input: 1A
// Output: 26

import java.util.*;                                        

public class p10
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        String str = sc.nextLine();

        int mul=1;                                                          // T.C. = O(n)   S.C. = O(1)
        int sum=0;
        
        for(int i=str.length()-1;i>=0;i--)
        {
            int digitValue;
            char ch = str.charAt(i);
            if(ch>='0' && ch<='9')
            {
                digitValue = ch-'0';
            }
            else if(ch>='A' && ch<='F')
            {
                digitValue = ch-'A' + 10;
            }
            else if(ch>='a' && ch<='f')
            {
                digitValue = ch-'a' + 10;
            }
            else
            {
                digitValue=0;
            }

            sum+=digitValue*mul;
            mul *=16;
        }

        System.out.println(sum);

    }
}