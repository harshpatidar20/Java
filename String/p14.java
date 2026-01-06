// Check if two Strings are Anagrams of each other

// Given two non-empty strings s1 and s2 of lowercase letters, determine if they are anagrams — i.e.,
// if they contain the same characters with the same frequencies.

// Examples:

// Input: s1 = “geeks”  s2 = “kseeg”
// Output: true
// Explanation: Both the string have same characters with same frequency. So, they are anagrams.

// Input: s1 = "allergy", s2 = "allergyy"
// Output: false
// Explanation: Although the characters are mostly the same, s2 contains an extra 'y' character. Since the frequency of characters differs,
// the strings are not anagrams.

// Input: s1 = "listen", s2 = "lists"
// Output: false
// Explanation: The characters in the two strings are not the same — some are missing or extra. So, they are not anagrams.

import java.util.*;

public class p14
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Str1 : ");                  
        String str1=sc.nextLine();
        System.out.print("Enter the Str2 : ");                              // T.C. = O(n log n)  &&  S.C. = O(n)
        String str2=sc.nextLine();

        char arr1[]=str1.toCharArray();                               // try with another method pls
        char arr2[]=str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);


        if(Arrays.equals(arr1,arr2))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

    }
}