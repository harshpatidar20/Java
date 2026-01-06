// Problem Statement – Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable. The task is to find the 
// minimum number of ‘*’ or ‘#’ to make it a valid string. The string is considered valid if the number of ‘*’ and ‘#’ are equal. 
// The ‘*’ and ‘#’ can be at any position in the string.
// Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input string.

// (*>#): positive integer
// (#>*): negative integer
// (#=*): 0
// Example 1:
// Input 1:

// ###***   -> Value of S
// Output :
// 0   → number of * and # are equal


import java.util.*;

public class p7
{
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str=sc.next();

        int count1=0;                                                                 // T.C. = O(n)    S.C. = O(1)
        int count2=0;

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='*')
            {
                count1++;
            }
            else 
            {
                count2++;
            }
        }

        System.out.println(count1 - count2);
    }
}
