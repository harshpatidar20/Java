// Remove spaces from a given string

// Given a string, remove all spaces from the string and return it. 

// Input:  "g  eeks   for ge  eeks  "
// Output: "geeksforgeeks"

// Input:  "abc d "
// Output: "abcd"

import java.util.*;

public class p5
{                                                                
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.nextLine();

        for(int i=0;i<str.length();)                                                   // T.C = O(n)    S.C. = O(1)
        {
            if(str.charAt(i)==' ')
            {
               i++;
            }
            else
            {
                System.out.print(str.charAt(i));
                i++;
            }
        }
    }
}