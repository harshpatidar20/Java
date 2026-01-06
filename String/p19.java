// Remove duplicates from a string

// Given a string s which may contain lowercase and uppercase characters. The task is to remove all duplicate characters 
// from the string and find the resultant string.

// Note: The order of remaining characters in the output should be the same as in the original string.

// Example:

// Input: s = geeksforgeeks
// Output: geksfor
// Explanation: After removing duplicate characters such as e, k, g, s, we have string as "geksfor".

// Input: s = HappyNewYear
// Output: HapyNewYr
// Explanation: After removing duplicate characters such as p, e, a, we have string as "HapyNewYr".

import java.util.*;

public class p19
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.nextLine();

        StringBuilder result = new StringBuilder();                                   // T.C = O(n)    S.C. = O(1)

        Set<Character> set = new HashSet<>();

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(!set.contains(ch))
            {
              result.append(ch);
              set.add(ch);  
            }
        }

        System.out.println(result.toString());
        
    }
}