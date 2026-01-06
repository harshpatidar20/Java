// Program to Check for Palindrome String.

// A string is said to be palindrome if the reverse of the string is the same as the string. In this article,
// we will learn how to check whether the given string is palindrome or not.

import java.util.*;

public class p2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.next();

        StringBuilder reverse = new StringBuilder();

        for(int i=str.length()-1;i>=0;i--)
        {
            reverse.append(str.charAt(i));
        }

        if(str.equals(reverse))                                                // T.C = O(n)    S.C. = O(n)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}