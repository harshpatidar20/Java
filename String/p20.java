// Print all the duplicate characters in a string

// Given a string s, the task is to identify all characters that appear more than once and print each as a
// list containing the character and its count.

// Examples:

// Input: s = "geeksforgeeks"
// Output: ['e', 4], ['g', 2], ['k', 2], ['s', 2]
// Explanation: Characters e, g, k, and s appear more than once. Their counts are shown in order of first occurrence.

// Input: s = "programming"
// Output: ['r', 2], ['g', 2], ['m', 2]
// Explanation: Only r, g, and m are duplicates. Output lists them with their counts.

// Input: s = "mississippi"
// Output: ['i', 4], ['s', 4], ['p', 2]
// Explanation: Characters i, s, and p have multiple occurrences. The output reflects that with count and order preserved.

import java.util.*;

public class p20
{
    public static void main(String agrs[])                            
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str=sc.nextLine();

        int freq[]=new int[26];

        for(int i=0;i<str.length();i++)                                        // T.C = O(n)    S.C. = O(1)       
        {
            freq[str.charAt(i)-'a']++;
        }

        boolean first=true;
        
        for(int i=0;i<str.length();i++)
        {
            int idx=str.charAt(i)-'a';
            if(freq[idx]>1)
            {
                if(!first)
                {
                System.out.print(", ");
                }
                System.out.print("["+"'"+str.charAt(i)+"'"+""+", "+freq[idx]+"]");
                freq[idx]=0;
                first=false;
            }
        }
    }   
}